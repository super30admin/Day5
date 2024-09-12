import java.util.HashMap;
import java.util.HashSet;

//Time Complexity: O(mk)  //  where m is the length of the pattern & k is the length of each word in the string
//Space Complexity:O(nk)  //  where n is the number of words each having a length of m.
//Did it successfully run on leetcode: yes

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if (pattern.length() != strArray.length)
            return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strArray[i];
            if (pMap.containsKey(pChar)) {
                if (!str.equals(pMap.get(pChar))) {
                    return false;
                }
            } else {
                pMap.put(pChar, str);
                if (set.contains(str)) {
                    return false;
                }
                set.add(str);
            }

        }
        return true;
    }
}