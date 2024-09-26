class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Character,Character> map = new HashMap<>();
        
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++) {
            
            char tmp1 = s.charAt(i);
            char tmp2 = t.charAt(i);
            
            if(!set.contains(tmp2)){                
                
                set.add(tmp2);
                if(!map.containsKey(tmp1))
                    map.put(tmp1,tmp2);
                else
                    return false;
                                
            }
            else{
                if(!map.containsKey(tmp1) || map.get(tmp1) != tmp2){
                    return false;
                }
                    
            }
                        
        }
        return true;
        
        
    }
}