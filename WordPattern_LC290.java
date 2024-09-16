
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes




class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pMap = new HashMap<Character, String>();
        HashMap<String,Character> sMap = new HashMap<>();
       String [] words = s.split(" ");
       // System.out.println(words.length);
        if(pattern.length()!=words.length) return false;
        
        for(int i=0; i<words.length;i++){
           char pKey = pattern.charAt(i);
           String sKey = words[i];
            
            if(pMap.containsKey(pKey)){
                if(!pMap.get(pKey).equals(sKey)) {
                    return false;}
            }
            
            else{
                pMap.put(pKey,sKey);
            }
             if(sMap.containsKey(sKey)){
                if(sMap.get(sKey)!=pKey) {
                    System.out.println("second");
                    return false;}
            }
            
            else{
                sMap.put(sKey,pKey);
            }
            
        }        
        
        