import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(N * L) [...where N: total words, L: length of word]  
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Idea is to create a key based on the characters, irrespective of their positions. 
// We use array of integer with length 26 which hashes string to its character count.
// Converting this int[] as string key in our result HashMap

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            // Create a key for grouping the anagrams together
            int[] charCount = new int[26];
            for (char ch : str.toCharArray()) {
                int charVal = ch - 'a';
                charCount[charVal]++;
            }

            // Convert int[] key into string, seprated by '-'
            StringBuilder sb = new StringBuilder();
            for (int count : charCount) {
                sb.append('-');
                sb.append(count);
            }

            String key = sb.toString();

            // Add or Update the list by looking up the above key
            if (!result.containsKey(key)) {
                // create a new List
                result.put(key, new ArrayList<String>());
            }
            // Add str into existing anagram group
            result.get(key).add(str);
        }

        // Get anagram groups as list
        return new ArrayList<>(result.values());
    }
}
