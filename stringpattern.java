
   class Solution {
    public boolean stringpattern(String pattern, String str) {
        String[] words = str.split(" ");

        if(words.length != pattern.length())
            return false;
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(map.containsValue(word) && !map.containsKey(c)){
                return false;
            }
            map.putIfAbsent(c, word);
            if(map.containsKey(c) && !(map.get(c).equals(word))){
                return false;
            }
        }
        return true;
    }
}
