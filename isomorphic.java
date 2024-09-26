class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null && t == null) return true;
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> values = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(sMap.containsKey(s.charAt(i))) {
                if(sMap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else {
                if(values.contains(t.charAt(i)))
                    return false;
                values.add(t.charAt(i));
                sMap.put(s.charAt(i), t.charAt(i));    
                
            }
            
        }
        
        return true;
        
        
        
    }
}
