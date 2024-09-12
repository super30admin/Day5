// Time Complexity : O(NKlogK) where n = number of words, k = maximum number of characters in a word
// Space Complexity : O(NK) where n = number of words, k = maximum number of characters in a word
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);

            if (map.get(key) == null) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}