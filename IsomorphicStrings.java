// Time Complexity: O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++) {
            Character st = s.charAt(i);
            Character ts = t.charAt(i);
            
            if(map.containsKey(st)) {
                 if(ts != map.get(st)) {
                     return false;
                 } 
            } else {
                if(!map.containsValue(ts))
                   map.put(st, ts);
                else
                    return false;
            }    
        }
        
        return true;
        
    }
}