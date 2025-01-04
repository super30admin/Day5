// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Map the character in string s to corresponding characters in string t and vice a versa and compare
// if the respective values match


public class IsomorphicStrings {
        public boolean isIsomorphic(String s, String t) {
            char[] smap = new char[256];
            char[] tmap = new char[256];

            for(int i=0;i<s.length();i++){
                int sindex = s.charAt(i) ;
                if(smap[sindex] == '\u0000'){
                    smap[sindex ] = t.charAt(i);
                }else if(smap[sindex] != t.charAt(i)){
                    return false;
                }
            }

            for(int i=0;i<t.length();i++){
                int tindex = t.charAt(i) ;
                if(tmap[tindex] == '\u0000'){
                    tmap[tindex ] = s.charAt(i);
                }else if(tmap[tindex] != s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
}
