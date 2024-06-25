/*
TC --> O(n)
SC --> O(n) since we are storing characters and strings together
 */
import java.util.*;

class Solution {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> data = new HashMap<>();
        HashMap<String, Character> valData = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            //System.out.println(str[i]);
            if (data.containsKey(c)) {
                // System.out.print(data.get(c)+" ");
                // System.out.println(str[i]);
                if (!data.get(c).equals(str[i])) {
                    return false;
                }
            } else if (valData.containsKey(str[i])) {
                return false;
            }
            data.put(c, str[i]);
            valData.put(str[i], c);

        }
        return true;

    }
}
