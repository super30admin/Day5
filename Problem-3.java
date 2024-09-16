//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        
        for(int i = 0;i<words.length; i++){
            char pChar = pattern.charAt(i);
            String w = words[i];
            
            if(!pMap.containsKey(pChar)){
                if(sMap.containsKey(w)){
                    return false;
                }else{
                    pMap.put(pChar,w);
                    sMap.put(w,pChar);
                }
            }else{
                String wordAtKey = pMap.get(pChar);
                if(!wordAtKey.equals(w)){
                    return false;
                }    
            }
                
        }return true;
    }
}