class Solution {
    
    // Time Complexity : O(n) where n is the size of the words array 
    // Space Complexity : O(k) - k = number of ASCII characters(128 or 256) based on input
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope

    public boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        int n = s.length();
        for(int i = 0; i < n; i++)   {
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;
            arr1[s.charAt(i)] = i + 1;
            arr2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
