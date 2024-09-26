// Time Complexity :O(l)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No




class Solution {
    public boolean isIsomorphic(String s, String t) {
        // edge case
        if(s.length()!=t.length()) return false;
        
        // two maps for two strings
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        
        // iterate through length of any array
        for(int i=0;i<s.length();i++){

            // check if s map contains character of s string
            if(!sMap.containsKey(s.charAt(i))){
                // if no put the s char as key and t char as value
                sMap.put(s.charAt(i),t.charAt(i));
            }else{

                // if yes check the s value is = to char of t, if not return false
                char sv = sMap.get(s.charAt(i));
                    if(sv!=t.charAt(i))
                        return false;
            }
            
            // this block logic is similar to above block
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),s.charAt(i));
            }else{
                char tv = tMap.get(t.charAt(i));
                    if(tv!=s.charAt(i))
                        return false;
            }
        }
        
        return true;
        
    }
    


}