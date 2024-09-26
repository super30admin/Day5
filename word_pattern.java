// similar to group anagrams we store character to string and string to character mappings
// 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) {
            return false;
        }
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = str[i];
            if(pMap.containsKey(c)) {
                if(!pMap.get(c).equals(word)) {
                    return false;
                }
            }
            else {
                pMap.put(c, word);
            }
            if(sMap.containsKey(word)) {
                if(!sMap.get(word).equals(c)) {
                    return false;
                }
            }
            else {
                sMap.put(word, c);
            }
        }
        return true;
    }
}