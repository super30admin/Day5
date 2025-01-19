// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/isomorphic-strings/
// Any problem you faced while coding this : No
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //Check if their lengths are equal
        if(s.length()!=t.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)]) 
                return false;
            
            //In this step we map the characters at the same index to a common number
            //If we try to remap something from one of the strings then the above condition returns false
            //i+1 instead of i as unmarked values are 0 and saving 0 for a mapping will cause conflict for the case i=0
            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
        }
        return true;
        
    }
}
