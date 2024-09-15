// Time Complexity : O(n) where n is length of provided String
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if( s.length() != t.length() ) return false; //checking if same length
        
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        
        for(int i=0; i < s.length(); i++) {
            if( sMap.containsKey(s.charAt(i)) && tMap.containsKey(t.charAt(i)) ) {
                if( tMap.get(t.charAt(i)).equals(s.charAt(i))) {
                    continue;
                } else {
                    return false;
                }
            }
            else if( sMap.containsKey(s.charAt(i)) || tMap.containsKey(t.charAt(i)) ){
                return false;
            }
            
            sMap.put(s.charAt(i), t.charAt(i));
            
            tMap.put(t.charAt(i), s.charAt(i));
                  
        }
                   
        return true;
    }
}