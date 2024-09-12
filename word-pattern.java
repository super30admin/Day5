import java.util.*;

//time complexity is O(n) //traversing through every character in string
//Space complexity is O(26) = O(1) because the pattern can be of max 26 unique characters 
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str_array = s.split(" ");

        if (pattern.length() != str_array.length) {
            return false;
        }

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String str = str_array[i];
            char ch = pattern.charAt(i);

            if (sMap.containsKey(str)) {

                // we check if the ch we get is same as our ch
                if (sMap.get(str) != ch) {
                    return false;
                }

            } else {
                // create key value in map
                sMap.put(str, ch);
            }

            if (pMap.containsKey(ch)) {
                // create key in map

                if (!pMap.get(ch).equals(str)) {
                    return false;
                }
            } else {
                pMap.put(ch, str);
            }
        }

        return true;

    }
}