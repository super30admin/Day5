
// Time Complexity:     O(n)
// Space Complexity:    O(1)
// where n is length of given string pattern
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern
{
    public static void main(String[] args) {
        String pattern = "abba" ;
        String s = "dog cat dog dog" ;
        FindPattern fp = new FindPattern();
        System.out.println(fp.wordPattern(pattern, s)) ;
    }
}

class FindPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");                                               // getting string array
        if (pattern.length() != words.length)                                                 // if lengths aren't same
            return false;
        else {
            Map<Character, String> map = new HashMap<>();
            Set<String> set = new HashSet<>();

            for (int i = 0; i < pattern.length(); i++) {
                Character tempC = pattern.charAt(i);
                String tempS = words[i];

                if (map.containsKey(tempC)) {                                                 // if character of String pattern is already key in map
                    String temp = map.get(tempC);
                    if (!temp.equals(tempS))                                                  // if String is different as value in map for key
                        return false;
                } else {
                    if (set.contains(tempS))                                                  // if String is present in set but no key corresponding in map
                        return false;
                    else {                                                                    // no key, value in map or no key in set
                        map.put(tempC, tempS);
                        set.add(tempS);
                    }
                }
            }
            return true;
        }
    }
}