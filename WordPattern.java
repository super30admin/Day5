import java.util.HashMap;

//Time Complexity - o(n)
//Space Complexity - 0(n) - 0(1) - because characters are constant to 26 or even 52 considering both small and capital letters
// Approach.
// if length of string array not equal to pattern array length return false
// map pattern to word and word to pattern.
// iterate through each map to see if the key already exists and if it does its mapped to value thats at the same index ad keys index
// if not return false. if exits loop checking for all elemets return true

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] stringArray = s.split(" ");
        char[] patternArray = pattern.toCharArray();
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        if (stringArray.length != patternArray.length) {
            return false;
        }
        for (int i = 0; i < patternArray.length; i++) {
            if (pMap.containsKey(patternArray[i])) {
                if (pMap.get(patternArray[i]) != stringArray[i]) return false;
            } else {
                pMap.put(patternArray[i], stringArray[i]);
            }

            if (sMap.containsKey(stringArray[i])) {
                if (sMap.get(stringArray[i]) != patternArray[i]) return false;
            } else {
                sMap.put(stringArray[i], patternArray[i]);
            }
        }
        return true;
    }
}
