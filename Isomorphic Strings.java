// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> sToMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();

        for(int i=0; i < s.length(); ++i){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sToMap.containsKey(sChar)){
                if(sToMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                if(tSet.contains(tChar)){
                    return false;
                }
            }

            sToMap.put(sChar, tChar);
            tSet.add(tChar);
        }

        return true;
    }
}