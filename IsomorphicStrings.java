/*
LC 205: Medium: https://leetcode.com/problems/isomorphic-strings/submissions/
Time Complexity : O(n)
Space Complexity : O(2n)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no

Your code here along with comments explaining your approach
Use 2 arrays as maps
Save the same integer value in both the sChar and tChar
If different, then return false
*/

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (m1[sChar] != m2[tChar]) {
                return false;
            }
            
            m1[sChar] = i+1;
            m2[tChar] = i+1;
        }
        
        return true;
    }
}