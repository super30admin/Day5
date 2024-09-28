// Time Complexity : O(N)
// Space Complexity : O(1) there could be only at the most 26 entries in the cToSMap and that would also restrict
// to 26 entries in sTOCMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public boolean wordPattern(String pattern, String s) {

        // 2 hash map
        HashMap<Character, String> cToSMap = new HashMap<>();
        HashMap<String, Character> sToCMap = new HashMap<>();

        String[] strArray = s.split(" ");
        int len = strArray.length;

        if (pattern.length() != len) return false;

        for (int i=0; i<len; i++) {
            String str = strArray[i];
            char character = pattern.charAt(i);
            System.out.println("String:" + str + ", Character: " + character);

            // Check for character to String Mapping
            if(cToSMap.containsKey(character)) {
                if(!str.equals(cToSMap.get(character))) {
                    return false;
                }
            } else {
                cToSMap.put(character, str);
            }

            // Check for String to character mapping
            if(sToCMap.containsKey(str)) {
                if(character != sToCMap.get(str)) {
                    return false;
                }
            } else {
                sToCMap.put(str, character);
            }
        }
        return true;
    }
}