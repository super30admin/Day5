// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// I also tried using HashMap instead of Arrays it worked.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArr = new char[256];
        char[] tArr = new char[256];
        
        // Using Arrays instead of hashmap to perform one-to-one mapping
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(sArr[s.charAt(i)] == 0)
                sArr[s.charAt(i)] = t.charAt(i);
            if(tArr[t.charAt(i)] == 0)
                tArr[t.charAt(i)] = s.charAt(i);
            
            if(tArr[t.charAt(i)] != s.charAt(i) || sArr[s.charAt(i)] != t.charAt(i))
                return false;
        }
        return true;
        
    }
}
