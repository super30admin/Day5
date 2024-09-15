// Time Complexity :  O(N log k + N) for sorting key of length K and processing all N elements in input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Since we have to group anagrams, we observe that two anagrams of a word are equal if they are sorted.
// So, we can sort any input word and the sorted word can be used as key in the map. Whenever we encounter a new word,
// we sort it and check if that key is present in the map, if it is present that means the current word is anagram of
// that key. So we add the word to the list of the previously sorted key.

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) return result;

        Map<String, List<String>> map = new HashMap<>();

        for (String input : strs) {
            matchInMap(map, input);
        }
        for (List<String> values : map.values()) {
            result.add(values);
        }

        return result;
    }

    /*right now you have map key for tan, nat as  "ant", which takes O(nlogn) to create map key */
    public void matchInMap(Map<String, List<String>> map, String input) {
        String temp = input;
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        String correctKey = new String(charArray);
        List<String> anagrams = map.getOrDefault(correctKey, null);
        if (anagrams == null) {
            anagrams = new ArrayList<>();
        }

        anagrams.add(input);
        map.put(correctKey, anagrams);
    }
}
