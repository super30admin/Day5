// Time Complexity : O(k) size of string
// Space Complexity : O(1) hasmmap size is fixed 256 ascii size
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
//use 2 maps to store characters of each string and occurence of 
//their first index. The next time same string occurs compare value
//of both maps it  should be same else return false
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int smap[] = new int[256];
        int tmap[] = new int[256];
        
        if(s.length() != t.length()) return false;
        
        for(int i=0;i<s.length();i++) {
            
            if(smap[s.charAt(i)]==0) {
                smap[s.charAt(i)]=i+1;
            }
            if(tmap[t.charAt(i)]==0) {
                tmap[t.charAt(i)]=i+1;
            }
            if(smap[s.charAt(i)]!=tmap[t.charAt(i)])
                return false;
        }
        return true;
    }
}
