// Before Class Solution

// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Created two array of length 127 due to 127 ascii values
// sArray stores the alternate char used at the same index in String t
// Boolean tArray is used to check if the Char is already been used for some char value in string s
// Loop over the string and for a particular char at i in s find its Ascii value (sArrayIndex) and store t char at i in sArray[sArrayIndex]
// if[sArrayIndex] == null add check if the corresponding string t char is not used by any other char n string s, then add string t char in sArray
// else return false
// if the char at sArray[sArrayIndex] does not match with string t char at i then return false  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArray = new char[127];
        boolean[] tArray = new boolean[127];
        for(int i=0;i<s.length();i++){
            int sArrayIndex = (int)s.charAt(i);
            int tArrayIndex = (int)t.charAt(i);
            if((int)sArray[sArrayIndex]==0){
                if(tArray[tArrayIndex] == true){
                    return false;
                }
                sArray[sArrayIndex] = t.charAt(i);
                tArray[tArrayIndex] = true;
            }else if(sArray[sArrayIndex] != t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}