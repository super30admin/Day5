class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) return false;
        
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<words.length; i++){
            if(!map1.containsKey(pattern.charAt(i))){
                map1.put(pattern.charAt(i), words[i]);
            } else if(!map1.get(pattern.charAt(i)).equals(words[i]) )
                return false;
            
            
            if(!map2.containsKey(words[i])){
                map2.put(words[i], pattern.charAt(i));
            } else if (!map2.get(words[i]).equals( pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}