//Time Complexity for Solution 2 O(N * length of each string * 26) Since 26 is a small constant can be ignored. O(N*len of strings)
//Space Complexity O(NK)   N for the number of elements in the hashmap and K for the length of eahc string in array
//leetcode: Yes.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    /* Solution 1
    *  incorrect Solution does not work for same strings. Since i am using a HashSet it does not consider the same strings again. Need to think over this again.
    * HashMap might be needed instead of HashSet
    * */
        public List<List<String>> groupAnagrams1(String[] strs) {
            HashSet<Character> set = new HashSet<Character>();
            HashSet<String> anagram_set = new HashSet<String>();
            List<List<String>> result = new ArrayList<List<String>>();
            boolean anagram = false;
            int k = 0;

            for (String string : strs) {
                //put the all the characters in the string in the hashset
                for (int i = 0; i < string.length(); i++) {
                    set.add(string.charAt(i));
                }
                System.out.println("Adding string in hashset : " + string+ " and value of K:"+k);
                List<String> list = new ArrayList<String>();
                //go through the remaining strings in the array and see if we have any anagrams
                for (int j = k+1; j < strs.length; j++) {
                    String temp = strs[j];
                    if (!anagram_set.contains(temp)) {
                        System.out.println("Current temp in the loop is: "+temp+" and value of k:"+k);
                        for(Character c : temp.toCharArray()) {
                            System.out.println("Current char c :"+c + " of string :"+ temp);
                            if (!set.contains(c)) {
                                anagram = false;
                                break;
                            }
                            anagram = true;
                        } //end of inner for loop
                        System.out.println("anagram value is :" + anagram);
                        if (anagram) {
                            System.out.println("anagram string is :" + temp);
                            list.add(temp);
                            anagram_set.add(temp);
                        }
                    }
                } //end of middle for loop
                //how do we check if there was anagram for this string,
                if (!anagram_set.contains(string)) {
                    list.add(string);
                    result.add(list);
                }
                k++;
                //remove all the charcaters of the current string from the set.
                set.clear();
            } //end of the outside first for loop
            return result;
        }


        /* Solution 2  Refered Leetcode to get this solution */


        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List> map = new HashMap<String, List>();
            int[] char_frequency = new int[26];  //size 26 because we can have only 26 types of characters in the string
            if (strs == null || strs.length == 0) {
                return new ArrayList<>();
            }

            for (String s :strs) {
                Arrays.fill(char_frequency, 0); //make sure to refill the array with 0 with zero everytime.
                for (char ch : s.toCharArray()) {
                    char_frequency[ch -'a']++;
                }
                StringBuilder sb = new StringBuilder("");
                for(int i = 0; i<26; i++) {
                    sb.append("#");
                    sb.append(char_frequency[i]);
                }
                String pattern = sb.toString();
                //Now see if the pattern already exists in the Map
                System.out.println("pattern string is "+ pattern);
                //if exists then just add the current string s in the list
                if (map.containsKey(pattern)) {
                    map.get(pattern).add(s);
                } else {
                    //if does not then add it, this means we are seeing this string first time (or any string with similar character first time)
                    map.put(pattern, new ArrayList());
                    map.get(pattern).add(s);
                }
            }
            //Once all the strings are done we return the values from hashmap (which is an list of strings)
            return new ArrayList(map.values());
        }

}
