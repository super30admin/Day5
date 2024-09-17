import java.util.*;
class isomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            if (!sMap.containsKey(first)) {
                sMap.put(first, second);
            } 
            else {
                if (sMap.get(first) != second) {
                    return false;
                }
            }
            if (!tMap.containsKey(second)) {
                tMap.put(second, first);
            } 
            else {
                if (tMap.get(second) != first) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("tab", "xaa"));
    }
}