class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        
        //base condition to check the length
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++) {
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            //check if char is not present in map.
            //If not present then -> insert a new key(c1)-> val(c2) 
            //If not present then -> check for the c2 present in the value of map
            if(!map.containsKey(c1)) {
                
                if(map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
            
            //If value at specified key is not equal then return false
            else if(map.get(c1) != c2) {
                return false;
            }
            
            
        }
        
        return true;
    }
}