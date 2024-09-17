
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        /*
         * Time Complexity: O(n) to iterate over each alphabet of the pattern
         * Space Complexity: O(1) as the alphabets of pattern remains constant 26 or 52
         *
         */
        String[] sArr = s.split(" ");
        
        if (pattern.length() != sArr.length) return false;
        
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        
        // checking for the case of pattern
        for (int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = sArr[i];
            
            if (pMap.containsKey(c)) {
                if (!pMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                pMap.put(c, str);
            }
        }
        
        // checking for the case of string
        for (int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = sArr[i];
            
            if (sMap.containsKey(str)) {
                if (!sMap.get(str).equals(c)) {
                    return false;
                }
            } else {
                sMap.put(str, c);
            }
        }
        
        return true;
    }
}
