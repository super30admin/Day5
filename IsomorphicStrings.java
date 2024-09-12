class Solution {
    // Time Complexity : O(n), where n is length of the string s or t.
    // Space Complexity : O(1), constant space complexity because the array size is always fixed and does not change with the input.
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) return false;

        char[] sArr = new char[127];
        char[] tArr = new char[127];
        Arrays.fill(sArr, '0');
        Arrays.fill(tArr, '0');

        for(int i = 0; i < len1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(sArr[ch1-' '] == '0') {
                sArr[ch1-' '] = ch2;
            } else {
                if(sArr[ch1-' '] != ch2) return false;
            }
            if(tArr[ch2-' '] == '0') {
                tArr[ch2-' '] = ch1;
            } else {
                if(tArr[ch2-' '] != ch1) return false;
            }
        }
        return true;
    }
}