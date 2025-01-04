import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Time Complexity: O(nk) as string is splited in array and it is traversed.
// Space Complexity: O(n)

// Using two data structure here, map and set is useful
public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
    }

    private static boolean wordPattern(String pattern, String s) {

        String[] sArray = s.split(" ");
        if (pattern.length() != sArray.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(sArray[i]))
                    return false;
            } else {
                map.put(pattern.charAt(i), sArray[i]);
                if (set.contains(sArray[i])) {
                    return false;
                }
                set.add(sArray[i]);
            }
        }
        return true;
    }
}
