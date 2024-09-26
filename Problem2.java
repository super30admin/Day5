import java.util.HashMap;
import java.util.HashSet;

//Time Complexity O(n)
//Space Complexity O(1)

class Solution {

    public static boolean isIsomorphic4(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] sInt = new int[100];
        int[] tInt = new int[100];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sInt[sChar - ' '] != tInt[tChar - ' '])
                return false;
            sInt[sChar - ' '] = i + 1;
            tInt[tChar - ' '] = i + 1;
        }
        return true;
    }


    public boolean isIsomorphic3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sMap = new char[100];
        char[] tMap = new char[100];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar - ' '] == 0) {
                sMap[sChar - ' '] = tChar;
            } else {
                if (sMap[sChar - ' '] != tChar) {
                    return false;
                }
            }
            if (tMap[tChar - ' '] == 0) {
                tMap[tChar - ' '] = sChar;
            } else {
                if (tMap[tChar - ' '] != sChar) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
                if (set.contains(tChar)) {
                    return false;
                }
                set.add(tChar);
            } else {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            }
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args){
        String s = "egg";
        String t = "add";
        boolean result = Solution.isIsomorphic4(s,t);
        System.out.println("Result "+result);
    }
}
