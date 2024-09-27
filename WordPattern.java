// Time Complexity :O(mk) , m is length of patrtern and k is avarege length of strings in s
// Space Complexity :O(nk), n  is  length of the strings in s
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
         
        String[] words=s.split(" ");
        System.out.println(" words "+ words.length+" s.length()"+s.length());
        
        if(pattern.length()!=words.length) return false;
        
        Map<Character,String> pMap = new HashMap<>();
        Map<String,Character> wMap = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            
            char pChar=pattern.charAt(i);
            String word = words[i];
            if(!pMap.containsKey(pChar)){
                pMap.put(pChar,word);
            }else{
              if(!pMap.get(pChar).equals(word)) return false;  
            }
            
            
            
            if(!wMap.containsKey(word)){
                wMap.put(word, pChar);
            }else{
                if(wMap.get(word)!=pChar) return false;    
            }
            
        }
        
        return true;  
        
    } 
}
