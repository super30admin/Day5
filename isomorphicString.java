class Solution {
    public boolean wordPattern(String pattern, String s) {
     
        HashMap<Character, String> sMap = new HashMap<>();
        HashMap<String, Character> tMap = new HashMap<>();
        
        String[] values = s.split(" ");
        
        if(pattern.length() != values.length) return false;
        
        for(int i=0; i< pattern.length(); i++){
            char sChar = pattern.charAt(i);           
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, values[i]);
            } else {
                if(!sMap.get(sChar).equals(values[i])) return false;
            }
            
            if(!tMap.containsKey(values[i])){
                tMap.put(values[i], sChar);
            } else {
                if(tMap.get(values[i]) != sChar) return false;
            }   
        }        
        return true;
        
    }  
}