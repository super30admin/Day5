// Time Complexity : O(nklogk). where k is length of the string
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // we are going to use hashmap to grouping the anagram strings.
        HashMap<String, List<String>> map = new HashMap<>();

        // using for loop to traverse through all the strings in the in strinf array
        for (int i = 0; i < strs.length; i++) {

            // we are going to convert each string into char array so, we can sort them and
            // check in hashmap that anagram of string is available or it is first one.
            char[] keyArray = strs[i].toCharArray();

            // sort keyArray
            Arrays.sort(keyArray);
            // convert sorted key array to string
            String key = new String(keyArray);

            // if map does not contains key that means there is no anagram of the string
            // is visited till now so we are going create arraylist refrenced to that key
            // and using linear probing to add each string refrence to anagram
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        // return group of anagrans.
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        System.out.println(groupAnagrams(strs));
    }
}