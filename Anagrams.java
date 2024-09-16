// Time Complexity : O(n * l) where n is number of strings in array and l is 
// the length of largest string. we loop through the array and then for each string
// we loop through all the characters.

// Space Complexity : O(N) is used by the hashMap.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : spent two hours trying to figure the right hash function before the class.

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Anagrams ana = new Anagrams();
        List<List<String>> response = ana.groupAnagrams(strs);

        System.out.println(response);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        //Map will store the hashCode and list of anagrams
        Map<Integer, List<String>> anaMap = new HashMap<>();

        //loop through each string in the array
        for(String str: strs) {
            int hashCode = getHashCode(str);

            //if found in map add it to the list of anagrams
            if(anaMap.containsKey(hashCode)) {
                List<String> vals = anaMap.get(hashCode);
                vals.add(str);
                anaMap.put(hashCode, vals);
            } 
            //otherwise offer it to the map
            else {
                List<String> val = new ArrayList<String>(){{add(str);}};
                anaMap.put(hashCode, val);
            }
        }
        List<List<String>> anas = new ArrayList<>(anaMap.values());
        return anas;
    }
    
    public int getHashCode(String str) {

        //here is the first 26 prime numbers. each for 26 alphabets.
        //this method will help us create a unique hashcode for each anagram.

        int[] chars = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        int hashCode = 1;
        
        for(Character ch : str.toCharArray()) {
            hashCode *= chars[ch-'a'];
        }
        return hashCode;
    }
}