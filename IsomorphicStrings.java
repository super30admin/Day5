// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//In the code below, we are trying to do a 1-1 mapping for each letter in string s to each letter in string t and vice versa in two hashmaps.
//At every iteration , we compare if this 1-1 mapping is maintained and return a false whenever we see a different value in the map compared
//to what the program is reading in string t and s

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> sToT = new HashMap<>();
        HashMap<Character,Character> tToS = new HashMap<>();
        
        
        for(int i=0;i<s.length();i++)
        {
            if(sToT.containsKey(s.charAt(i)) && sToT.get(s.charAt(i))!=t.charAt(i))
            {
                return false;
            }
            else
            {
                sToT.put(s.charAt(i),t.charAt(i));
            }
            
            if(tToS.containsKey(t.charAt(i)) && tToS.get(t.charAt(i))!=s.charAt(i))
            {
                return false;
            }
            else
            {
                tToS.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
        
    }
}