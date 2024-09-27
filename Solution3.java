class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] mappedWords = s.split(" ");
        if(pattern.length() != (mappedWords.length)) return false;

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(!map.containsValue(mappedWords[i])){
                    map.put(c, mappedWords[i]);
                }
                else return false;
            }
            else{
                if(!map.get(c).equals(mappedWords[i])) return false;
            }
        }
        return true;
    }
}