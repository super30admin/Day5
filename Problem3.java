Time Complexity: O(n). n is a number of characters in pattern string.
Space Complexity: O(n). At most, Two hashmaps will have n entries each.

class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] strArray = str.split(" ");
        if(pattern.length() == 0 || str.length() == 0 || pattern.length() != strArray.length) return false;
        
        HashMap<Character, String> charToStringMap = new HashMap<Character, String>();
        HashMap<String, Character> stringToCharMap = new HashMap<String, Character>();
        
        for(int i = 0; i < pattern.length(); i++) {
            
            if(charToStringMap.containsKey(pattern.charAt(i))) {
                if( ! (charToStringMap.get( pattern.charAt(i) ).equals(strArray[i]) )) {
                    return false;
                }
            }
            
            if(stringToCharMap.containsKey(strArray[i])) {
                if( ! (stringToCharMap.get(strArray[i]) == pattern.charAt(i) )) {
                    return false;
                }
            }
            charToStringMap.put(pattern.charAt(i), strArray[i]);
            stringToCharMap.put(strArray[i], pattern.charAt(i));
        }
        
        return true;
    }
}
