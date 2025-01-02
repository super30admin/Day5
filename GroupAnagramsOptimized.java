//TC: O(nk)
//SC: O(nk)
//approach: for each string calculate the char frequency using fixed-size array of size 26, convert array into unique key string
// create hashmap with the unique key strng as key and all values with same key string , return values as groups in result

import java.util.*;

public class GroupAnagramsOptimized {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append('#').append(count); // Adding '#' as a delimiter to separate counts
            }
            String key = keyBuilder.toString();

            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}

