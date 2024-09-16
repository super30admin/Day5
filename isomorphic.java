// Time Complexity : O(n)
// Space Complexity : 0(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar)
                    return false;
            }
            else{
                if(tSet.contains(tChar))
                    return false;
                sMap.put(sChar,tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}
