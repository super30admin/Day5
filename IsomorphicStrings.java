// Time Complexity : O(n)
// Space Complexity : O(1) - since atmax the maps will contain only 26 elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
            }
            else{
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            }
            else{
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
        }
        return true;
    }
}
