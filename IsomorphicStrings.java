/**
 * Time Complexity: O(N) where N is the length of the string
 * Space Complexity: O(1) (Memory consumed is independent of the length of input strings)
 * LeetCode: Y (https://leetcode.com/problems/isomorphic-strings/)
 * Approach: 
    Have two int arrays intiialized to zero
    Traverse through the strings simultaneously
        if the mapping in mapping1 for s[i] does not equals mapping in mapping2 for t[i] then return false 
        Store the most-recent 1-based index occurence of each character in string s in the first array
        Store the most-recent 1-based index occurence of each character in string t in the second array
 * This approach works because it checks for the validity of two-way mappings in string s and string t
 */ 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Store the most-recent 1-based index occurence of each character in string s in the first array
        int[] mapping1 = new int[128];
        // Store the most-recent 1-based index occurence of each character in string t in the second array
        int[] mapping2 = new int[128];
        
        // Traverse through the string
        for(int i = 0 ; i < s.length() ; i++) {
            // Check for corresponding mappings
            if(mapping1[s.charAt(i)] != mapping2[t.charAt(i)]) {
                return false;
            }
            // Update the mapping of character in string s
            mapping1[s.charAt(i)] = i + 1;
            // Update the mapping of character in string t
            mapping2[t.charAt(i)] = i + 1;
        }
        // no mismatch discovered so return true
        return true;
    }
}
