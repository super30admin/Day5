class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        
        //check if the words count = #of character in pattern
        if(words.length != pattern.length()){
            return false;
        }
        
        HashMap<String, Character> map = new HashMap<>();
        
        for(int i = 0; i<words.length; i++){
            
            //if the word at specific location != character at that position then return false
            if(map.containsKey(words[i]) && (map.get(words[i]) != pattern.charAt(i))) {
                return false;
            }
            
            if(!map.containsKey(words[i])){
                if(map.containsValue(pattern.charAt(i))){
                    return false;
                }
                map.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}