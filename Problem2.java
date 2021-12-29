// Time Complexity : O(n), where n is the length of either of the strings s or t
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No Problem faced

class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for(int i=0;i<n;i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)])
                return false;
            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }
        return true;
    }
}