class Solution {
    public boolean isIsomorphic(String s, String t) {
        // null case
        if(s.length() != t.length()) return false;
        // create a hashmap 
        HashMap<Character,Character> h = new HashMap<Character,Character>();
        // for loop to point at variables of two different strings
        for(int i = 0; i<s.length();i++){
            // check char at i of s is present in the map
            if(h.containsKey(t.charAt(i))){
                if((h.get(t.charAt(i))) == s.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            
            } else{
                h.put(t.charAt(i),s.charAt(i));
            }
        
        }
        boolean a = true;
        h.clear();
        for(int i = 0; i<s.length();i++){
            // check char at i of s is present in the map
            if(h.containsKey(s.charAt(i))){
                if((h.get(s.charAt(i))) == t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            
            } else{
                h.put(s.charAt(i),t.charAt(i));
            }
        
        }
        boolean b = true;
        if(a&&b) return true;
        else return false;
        
        
        
        
    }
}

