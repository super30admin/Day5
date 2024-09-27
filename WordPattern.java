public class WordPattern {

    //TC is O(n) where n is the string length
    //SC is constant as both maps will have max of 26 entries
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            if (charMap.containsKey(patternChar)) {
                if (!charMap.get(patternChar).equals(words[i]))
                    return false;
            } else {
                charMap.put(patternChar, words[i]);
            }
            if (stringMap.containsKey(words[i])) {
                if (!stringMap.get(words[i]).equals(patternChar))
                    return false;
            } else {
                stringMap.put(words[i], patternChar);
            }

        }
        return true;
    }

    public static void main(String args[]){
        String s = "egg";
        String t = "dog cat cat";
        wordPattern(s,t);
    }
}
