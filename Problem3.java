class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] wordArray = s.split(" ");
        if (pattern.length() != wordArray.length){
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        
        
        for (int i = 0; i < pattern.length(); i++){
            char sChar = pattern.charAt(i);
            String word = wordArray[i];
            
            if(patternMap.containsKey(sChar)){
                if(!patternMap.get(sChar).equals(word)){
                    return false;
                }
            } else {
                patternMap.put(sChar,word);
            }

            if(wordMap.containsKey(word)){
                if(wordMap.get(word) != sChar){
                    return false;
                }
            } else {
                wordMap.put(word,sChar);
            }
        }
        System.out.print(patternMap);
        System.out.print(wordMap);
        return true;
        
    }
}
