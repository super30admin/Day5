/*
The below solution is done using two arrays which has 
Time complexity ->O(N)
Space complexity -> O(1) Since the hashMap has finite number of Characters
*/

class Solution4 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = new char[256];
        char[] tArray = new char[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sArray[sChar] != 0) {
                if(sArray[sChar] != tChar) {
                    return false;
                }
            }else {
                sArray[sChar] = tChar;
            }
            if(tArray[tChar] != 0) {
                if(tArray[tChar] != sChar) {
                    return false;
                }
            }else {
                tArray[tChar] = sChar;
            }
        }
        return true;
    }
}