class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        // HashMap<String, Character> strMap = new HashMap<>();

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strs[i];
            
            // First solution with hashmap + HashMap
            // if(patternMap.containsKey(pChar)) {
            //     if(!patternMap.get(pChar).equals(str)) {
            //         return false;
            //     }
            // } else {
            //     patternMap.put(pChar, str);
            // }

            // if(strMap.containsKey(str)) {
            //     if(strMap.get(str) != pChar) {
            //         return false;
            //     }
            // } else {
            //     strMap.put(str, pChar);
            // }

            // Second solution with hashmap + hashset
            if(patternMap.containsKey(pChar)) {
                if(!patternMap.get(pChar).equals(str)) {
                    return false;
                }
            } else {
                patternMap.put(pChar, str);
                if(set.contains(str)) {
                    return false;
                }
                set.add(str);
            }
        }
        return true;
    }
}
