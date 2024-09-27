// Time Complexity : Approach 1 => O(nklog(k)), Approach 2 => O(nk) where n = size of strs array, k = max size a string in the strs array
// Space Complexity : O(nk) where n = size of strs array, k = max size a string in the strs array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem_1 {

    // Approach 1
    public static List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList(); // If strs array is empty, return empty arraylist
        }
        HashMap<String, List> res = new HashMap<String, List>(); // Hashmap to store result
        for (String curr: strs) {
            char[] chararr = curr.toCharArray(); // Convert current string in the strs array to character array
            Arrays.sort(chararr); // Sort the character array
            String key = String.valueOf(chararr); // Convert the character array back to string, this soted string is the key for hashmap
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList()); // If hashmap doesn't already have the key, initialise a new ArrayList at index corresponding to the key in hashmap
            }
            res.get(key).add(curr); // Add the current string to ArrayList at index corresponding to the key in hashmap
        }
        return new ArrayList(res.values()); // Return arraylist containing the values in the Hashmap
    }
    
    // Approach 2
    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList(); // If strs array is empty, return empty arraylist
        }
        HashMap<String, List> res = new HashMap<String, List>(); // Hashmap to store result
        int[] countchar = new int[26]; // Initialise a countchar array of size 26 since there are 26 alphabets in English
        for (String curr: strs) {
            Arrays.fill(countchar, 0); // Fill the countchar array with 0
            for (int i = 0; i < curr.length(); i++) {
                countchar[curr.charAt(i) - 'a']++; // Increment value at index of countchar array corresponding to each char in current string
            }
            String key = "";
            for (int i = 0; i < 26; i++) {
                key += "#" + countchar[i]; // Convert the values in teh countchar array to a string by putting hash before value of each index
            }
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList()); // If hashmap doesn't already have the key, initialise a new ArrayList at index corresponding to the key in hashmap
            }
            res.get(key).add(curr); // Add the current string to ArrayList at index corresponding to the key in hashmap
        }
        return new ArrayList(res.values()); // Return arraylist containing the values in the Hashmap
    }

    public static void main(String args[]) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "hat"};
        List<List<String>> ans1 = groupAnagrams1(strs);
        List<List<String>> ans2 = groupAnagrams2(strs);
        System.out.println("Approach 1 ans: " + ans1);
        System.out.println("Approach 2 ans: " + ans2);
    }
}