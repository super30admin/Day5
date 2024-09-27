/**
* Space :O(N)
* Time : O(N)
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []words = s.split(" ");
        if(words.length != pattern.length())
            return false;
    
        HashMap<Character, String> wordMap = new HashMap<Character, String>();
        HashMap<String, Character> charMap = new HashMap<String, Character>();
        boolean result = true;
        for(int i=0;i<pattern.length();i++){
            if(wordMap.containsKey(pattern.charAt(i)))
            {   
                 result = (wordMap.get(pattern.charAt(i)).equals(words[i]));
                 if(result == false)
                     return false;
              
            }
            else if (charMap.containsKey(words[i])){
                return false;
            }
            
            else{
                charMap.put(words[i], pattern.charAt(i));
                wordMap.put(pattern.charAt(i), words[i]);            
            }
            
        }
        
        return result;
        
    }
}
