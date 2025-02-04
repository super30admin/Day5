import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] patternArr = pattern.split("");  
        String[] sArr = s.split(" ");  
        if (patternArr.length != sArr.length) {
            return false;
        }


        HashMap<String, String> strMap = new HashMap<>();
        HashMap<String, String> wordMap = new HashMap<>();
        

        for (int i = 0; i < patternArr.length; i++) {
            String patternChar = patternArr[i];
            String word = sArr[i];
            
            
            if (strMap.containsKey(patternChar)) {
                if (!strMap.get(patternChar).equals(word)) {
                    return false;  
            } else {
                strMap.put(patternChar, word);  
            }
            
      
            if (wordMap.containsKey(word)) {
                if (!wordMap.get(word).equals(patternChar)) {
                    return false;  
                }
            } else {
                wordMap.put(word, patternChar);  
            }
        }
        
         
    }
    return true; 
}
//return true; 
}
