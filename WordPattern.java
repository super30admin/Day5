class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] splited = s.split("\\s+");
        
        if(pattern.length() != splited.length) {
            System.out.println("pattern length: " + pattern.length() + " s length: "+ splited.length );
            return false;
        }
        
        Map<Character,String> map = new HashMap<>();
        
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<pattern.length(); i++) {
            
            char tmp1 = pattern.charAt(i);
            String tmp2 = splited[i];
            
            if(!set.contains(tmp2)){                
                
                set.add(tmp2);
                if(!map.containsKey(tmp1)){
                    map.put(tmp1,tmp2);
                }
                else
                    return false;
                                
            }
            else{
                if(!map.containsKey(tmp1) || !map.get(tmp1).equals(tmp2)){
                    return false;
                }
                    
            }
                        
        }
        return true;
        
        
    }
     
}