import java.util.*;
class wordPattern {
    public static boolean wordPattern(String pattern, String str) {
        if (pattern == "" && str == "") return true;
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) return false;
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String s2 = arr[i];
            if (!map1.containsKey(c1)) {
                map1.put(c1, s2);
            }
            else {
                if (map1.get(c1).compareTo(s2) != 0) {
                    return false;
                }
            }
            if (!map2.containsKey(s2)) {
                map2.put(s2, c1);
            }
            else {
                if (map2.get(s2) != c1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}