//Time Complexity : O(n) where n = length of pattern
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :

/**
 * https://leetcode.com/problems/word-pattern/
 * 
 * Given a pattern and a string str, find if str follows the same pattern.

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
 */
import java.util.HashMap;


/**
 * https://leetcode.com/problems/word-pattern/
 * 
 * Given a pattern and a string str, find if str follows the same pattern.

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
 */

public class WordPattern {

	public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
    
        if(words.length != pattern.length()) return false;
        
        HashMap<String, Character> charWordMap= new HashMap<>();
        boolean[] visited = new boolean[27];
        
        for(int i=0; i< words.length; i++) {
            Character c = pattern.charAt(i);
            String word = words[i];
            
            if(!charWordMap.containsKey(word)) {
                //if word is seen first time then corresponding char should not be seen before
                if(visited[c - 'a']) 
                    return false;
                
                charWordMap.put(word, c);
                visited[c - 'a'] = true; 
            } else
                if(!charWordMap.get(word).equals(c)) {
                    return false;
                }
        }
        
        return true;
    }
}
