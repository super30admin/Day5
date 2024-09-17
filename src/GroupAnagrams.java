// Time Complexity : O(nk log(k) where n is the size of the array and k is the avrage length of words in the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sortedString = str.toCharArray();
            Arrays.sort(sortedString);
            if (map.containsKey(String.valueOf(sortedString))) {
                map.get(String.valueOf(sortedString)).add(str);
            }
            else {
                map.put(String.valueOf(sortedString), new ArrayList<>(){{add(str);}});
            }
        }

        return new ArrayList<>(map.values());
    }
}