// Time Complexity: O(n), where n is the number of characters in the pattern and the number of words in the string
// Space Complexity: O(n), where n is the number of characters in the pattern or the number of words in the string

import java.util.HashMap;
import java.util.HashSet;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] pchar = pattern.toCharArray();
        String[] ssplit = s.split(" ");
        if (pchar.length != ssplit.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> values = new HashSet<>();
        for (int i = 0; i < pchar.length; i++) {
            if (!map.containsKey(pchar[i])) {
                if (values.contains(ssplit[i]))
                    return false;
                map.put(pchar[i], ssplit[i]);
                values.add(ssplit[i]);
            } else {
                if (!map.get(pchar[i]).equals(ssplit[i]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
    }
}
