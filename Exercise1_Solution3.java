import java.util.HashMap;
import java.util.HashSet;

/*
The below solution is done using one hashMap and one hashSet which has 
Time complexity ->O(N)
Space complexity -> O(1) Since the hashMap has finite number of Characters
*/

class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if(tSet.contains(tChar)) {
                    return false;
                }
                tSet.add(tChar);
                sMap.put(sChar, tChar);
            }

        }
        return true;
    }
}