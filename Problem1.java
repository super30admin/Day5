/*
https://leetcode.com/problems/group-anagrams/
Given an array of strings, group anagrams together.
Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
Note: All inputs will be in lowercase. The order of your output does not matter.
*/

import java.util.*;
class Problem1{

    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char wordArr[] = word.toCharArray();
            Arrays.sort(wordArr);
            String sorted_word = new String(wordArr);
            if (map.containsKey(sorted_word)) {
                List<String> list = map.get(sorted_word);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted_word, list);
            }
        }
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            res.add(list);
        }
        return res;
    }
}