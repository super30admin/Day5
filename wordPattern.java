import java.util.HashMap;

//TC :  O(nk) Here we are assuming that length of a string is k and there are n strings. So to split a string to array of a strings it will take O(nk)
//SC : O(n)
public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if (strArr.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            char c = pattern.charAt(i);
            String str = strArr[i];
            //Checking if char c in patternmap is equal to string in stringMap
            if (patternMap.containsKey(c)) {
                if (!str.equals(patternMap.get(c))) {
                    return false;
                }
            }
            // if not present add it to the patternmap and viceverse
            else {
                patternMap.put(c, str);
            }
            if (stringMap.containsKey(str)) {
                if (stringMap.get(str) != c) {
                    return false;
                }
            } else {
                stringMap.put(str, c);
            }

        }
        return true;
    }
}
