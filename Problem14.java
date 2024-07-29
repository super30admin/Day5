// Time Complexity: O(N * K * log(K))
// Space Complexity: O(N * K)
// Grouping Anagrams Together

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store the grouped anagrams
        Map<String, List<String>> anagrams = new HashMap<>();

        // Iterate through each string in the input array
        for (String s : strs) {
            // Sort the characters in the string to form the key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // If the key does not exist in the map, initialize a new list
            if (!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<>());
            }
            // Append the original string to the list corresponding to the key
            anagrams.get(sortedStr).add(s);
        }

        // Convert the map values to a list and return
        return new ArrayList<>(anagrams.values());
    }
}