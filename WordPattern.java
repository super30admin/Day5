class WordPattern {
    HashMap<Character, String> letterToWord = new HashMap<>();
    HashSet<String> mappedWords = new HashSet<>();
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        int idx = 0;
        for(char c : pattern.toCharArray()){
            if(letterToWord.containsKey(c)){
                if(!letterToWord.get(c).equals(words[idx]))
                    return false;
            }
            else{
                if(mappedWords.contains(words[idx]))
                    return false;
                letterToWord.put(c, words[idx]);
                mappedWords.add(words[idx]);
            }
            idx++;
        }
        return true;
    }
}