import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Time complexity: O(n) - we are iterating over all the characters of two strings
// Space complexity: O(1) - We will be storing a constant number of characters (ASCII characters. As per the question).
// Even though if the string length is infinity with same character, we will be storing it only once.
public class Isomorphic {

    // LeetCode # 205
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() != t.length()) return false;

        // Map will hold the mapping of characters from s to t
        Map<Character, Character> sMap = new HashMap<>();

        // This set will be used to check if the element in t string is already been mapped or not.
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar, t.charAt(i));
                if(set.contains(tChar)) return false;

                set.add(tChar);
            }else {
                if(sMap.get(sChar) != tChar)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        boolean answer = iso.isIsomorphic("egg", "add");
        System.out.println("answer = " + answer);
    }
}
