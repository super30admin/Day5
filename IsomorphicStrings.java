/*
We use 2 arrays to store ascii values of characters in s and t. For each character in s we check the same index character
in t. If the s-array is occupied for that character then it should be equal to tchar value, else return false.
If it is not occupied, we check t-array, if t-array is used before then return false, else s-array value equal to character in t
and make t-array value as 1 to indicate that it is occupied now. 
*/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){
            return false;
        }
        int[] s1=new int[256];
        int[] t1=new int[256];
        for(int i=0;i<sl;i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(s1[sChar-' ']!=0){
                if(s1[sChar-' ']!=tChar){
                    return false;
                }
            }else{
                if(t1[tChar-' ']>0){
                    return false;
                }
                s1[sChar-' ']=tChar;
                t1[tChar-' ']++;
            }

        }
        return true;
    }

}
