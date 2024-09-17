class Solution {
    public boolean wordPattern(String pattern, String s) {
        // split the sentence into words
        String[] words = s.split(" ");
        // null case 
        if(words.length != pattern.length()) return false;
        //hashmap
        HashMap<Character, String> h = new HashMap<>();
        // iteration
        for(int i = 0 ;i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c).equals(words[i])){
                    continue;
                } else {
                    return false;
                }
            } else{
                if(h.containsValue(words[i])){
                    return false;
                }
                h.put(c,words[i]);
            }
        }
        return true;
        
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 