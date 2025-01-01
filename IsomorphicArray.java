// Time Complexity : O(n) where n is length of s/t
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : ascii is 128 not -'a'

package Hashing1;

class IsomorphicArray {
    /*
    add every ele in key and reverse map with next string, if any mismatch return false or return true
     */
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()||s==null||s.length()==0){
            return false;
        }
        int sArray [] = new int[128];
        int tArray [] = new int[128];
        for(int i=0;i<128;i++){
            sArray[i]=-1;
            tArray[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            int sChar = s.charAt(i);
            int tChar = t.charAt(i);
            if(sArray[sChar]!=-1 && sArray[sChar]!=tChar){
                return false;
            }
            else{
                sArray[sChar]=tChar;
            }
            if(tArray[tChar]!=-1 && tArray[tChar]!=sChar){
                return false;
            } else{
                tArray[tChar]=sChar;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(new IsomorphicArray().isIsomorphic("egg","add"));
        System.out.println(new IsomorphicArray().isIsomorphic("foo","bar"));
    }
}