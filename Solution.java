//Isomerphic Strings

// 2 HashMap Solution
// Time -> O(n)
// Space -> O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar)) {
                sMap.put (sChar, tChar);
            } else {
                if (tChar != sMap.get(sChar)) {
                    return false;
                }
            }
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tMap.put (tChar, sChar);
            }
        }
        return true;
    }
}

// 1 HashMap 1 HashSet Solution
// Time -> O(n)
// Space -> O(1)


class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

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
                sMap.put (sChar, tChar);
                if (tSet.contains(tChar)) {
                    return false;
                }
                tSet.add(tChar);
            }

        }
        return true;
    }
}

// 2 Char Array Solution
// Time -> O(n)
// Space -> O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] sMap = new char[100];
        char[] tMap = new char[100];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar - ' '] != 0) {
                if (sMap[sChar - ' '] != tChar) {
                    return false;
                }
            } else {
                sMap[sChar - ' '] = tChar;
            }
            if (tMap[tChar - ' '] != 0) {
                if (tMap[tChar - ' '] != sChar) {
                    return false;
                }
            }
            else {
                tMap[tChar - ' '] = sChar;
            }

        }
        return true;
    }
}

-----------------------------------------------------------------------------------------------

// Word Pattern
// N = n * k: n = Number of unique words and k = length of a string
// M = m * k: m = Number of unique words and k = length of a string
// Time -> O(M) + O(N)
// Space -> O(N)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strArray = s.split(" ");
        if (pattern.length() != strArray.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strArray[i];

            if (pMap.containsKey(pChar)) {
                if (!str.equals(pMap.get(pChar))) {
                    return false;
                }
            }
            else {
                pMap.put (pChar, str);
            }
            if (sMap.containsKey(str)) {
                if (sMap.get(str) != pChar) {
                    return false;
                }
            }
            else {
                sMap.put (str, pChar);
            }
        }
        return true;
    }
}