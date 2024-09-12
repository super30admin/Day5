public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String strArr[] = s.split(" ");

        if (pattern.length() != strArr.length)
            return false;

        Map<Character, String> patternToStr = new HashMap<>();
        Map<String, Character> strToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentStr = strArr[i];

            if (patternToStr.containsKey(currentChar)) {
                if (!patternToStr.get(currentChar).equals(currentStr))
                    return false;
            } else {
                if (strToPattern.containsKey(currentStr))
                    return false;
                else {
                    patternToStr.put(currentChar, currentStr);
                    strToPattern.put(currentStr, currentChar);
                }
            }
        }
        return true;
    }
}
