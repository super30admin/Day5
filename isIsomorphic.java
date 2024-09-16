class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null || s.length() != t.length()) return false;
        int chars[] = new int[256], chart[] = new int[256];
        for (int i=0; i<s.length(); i++) {
            if (chars[s.charAt(i)] != chart[t.charAt(i)]) return false;
            chars[s.charAt(i)] = i+1;
            chart[t.charAt(i)] = i+1;
        }
        return true;
    }
}