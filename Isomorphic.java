import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Time Complexity : O(N) : N is length of the String
*  Space Complexity : O(1) : HashMap will store only 26 entries(a-z)
* */
public class Isomorphic {
    // Using 2 HashMap Solution
    public boolean isIsomorphic(String s, String t) {
        // Checking base condition
        if(s.length() != t.length()) {
            return false;
        }
        // Creating hashmap to store pair
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        // Iterating through the string s
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // Checking key is present in the SMap
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
            // Checking key is present in the TMap
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }else {
                tMap.put(tChar, sChar);
            }

        }
        return true;
    }

    // Using 1 HashMap, and 1 HashSet Solution
    public boolean isIsomorphic(String s, String t) {
        // Checking base condition
        if(s.length() != t.length()) {
            return false;
        }
        // Creating hashmap to store pair
        Map<Character, Character> sMap = new HashMap<>();
        HashSet<Character> hashSet = new HashSet<>();

        // Iterating through the string s
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // Checking key is present in the SMap
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
                if(hashSet.contains(tChar)) return false;

                hashSet.add(tChar);
            }

        }
        return true;
    }
}
