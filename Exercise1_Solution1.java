import java.util.HashMap;

/*
The below solution is done using one hashMap which has 
Time complexity ->O(N)
Space complexity -> O(1) Since the hashMap has finite number of Characters
*/

class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hashCheck = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (hashCheck.containsKey(sChar)) {
                if (hashCheck.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if(hashCheck.containsValue(tChar)) {
                    return false;
                }
                hashCheck.put(sChar, tChar);
            }
        }
        return true;
    }

}