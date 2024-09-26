import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 * 
 * Given a pattern and a string , find if the string follows the pattern or not.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

Source Link: https://leetcode.com/problems/word-pattern/
 * 
 * Constraints:

    1 <= pattern.length <= 300
    pattern contains only lower-case English letters.
    1 <= s.length <= 3000
    s contains only lowercase English letters and spaces ' '.
    s does not contain any leading or trailing spaces.
    All the words in s are separated by a single space.
 */

/**
 * Using 2 hashmaps
 * time complexity: O(1)
 * space complexity: O(nk) ==> O(k) ==> O(1)
 * n --> characters stored as key --> 26 only
 * k --> Strings stored as key --> 300 max
 */
public class Problem14 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> tmap = new HashMap<>();
        

        String[] split = s.split(" ");
        if (split.length != pattern.length()) return false;
        
        for(int i = 0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            
            if(!map.containsKey(p)){
                map.put(p, split[i]);
            } else {
                if(!map.get(p).equals(split[i])){
                    return false;
                }
            }
            
            if(!tmap.containsKey(split[i])){
                tmap.put(split[i], p);
            } else {
                if(!tmap.get(split[i]).equals(p)){
                    return false;
                }
            }
            
        }
        return true;
    } 
}

/**
 * using a hashmap and a set
 * time complexity: O(1)
 * space complexity: O(nk) ==> O(1)
 * n --> characters stored as key --> 26 only
 * k --> Strings stored in set --> 300 max 
 * 
 */
class Problem14Approach1{
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] split = s.split(" ");
        if (split.length != pattern.length()) return false;
        
        for(int i = 0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            
            if(!map.containsKey(p) && !set.contains(split[i])){
                map.put(p, split[i]);
                set.add(split[i]);
            } else {
                if(!split[i].equals(map.get(p))){
                    return false;
                }
            }
            
        }
        return true;
    }
}
