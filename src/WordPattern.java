class Solution {
    public boolean wordPattern(String pattern, String s) {
        //edge case
        String[] words = s.split(" ");

        if(pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> sMap = new HashMap<>();
        HashMap<String, Character> tMap = new HashMap<>();

        for(int i = 0; i < pattern.length();i++) {
            char sChar = pattern.charAt(i);
            String tWord = words[i];

            if(sMap.containsKey(sChar)) {
                if(!sMap.get(sChar).equals(tWord)) {
                    return false;
                }
            } else {
                sMap.put(sChar,tWord);
            }

            if(tMap.containsKey(tWord)) {
                if(!tMap.get(tWord).equals(sChar)) {
                    return false;
                }
            } else {
                tMap.put(tWord,sChar);
            }
        }
        return true;
    }
}

