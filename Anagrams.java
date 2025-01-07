// Time Complexity : O(nk) where n is no of strings and k is maximum length of string
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach :
  /*The frequency-based key is used as the HashMap key, and each string is added to the list corresponding to that key.*/


import java.util.*;

public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to group anagrams based on character frequency
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Create a frequency array for the current string
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Convert the frequency array into a string key
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append('#'); // Append count with a separator
            }
            String key = keyBuilder.toString();

            // Add the string to the corresponding group in the map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}