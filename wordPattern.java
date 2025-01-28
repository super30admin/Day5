/*
 * Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between 
 * a letter in pattern and a non-empty word in str.
Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and 
str contains lowercase letters that may be separated by a single space.
 */

// Time Complexity : O(nk) 
// Space Complexity : O(1) - constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * In this I have used 2 hashmaps to keep track of character to word and word to character matching. While traversing, finding if a character of
 * pattern is already present in hash map or not. If it is not present, then create an entry. If it is already present then check if the value of
 * character present matches current word. This is done in reverse for 2nd hashmap i.e., word to character mapping.
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patWordMap = new HashMap<>();
        HashMap<String, Character> wordPatMap = new HashMap<>();
        String []str = s.split("\\s");
        if(pattern.length()!=str.length) return false;
        for(int i = 0; i<pattern.length();i++ ){
            char c = pattern.charAt(i);
            String word = str[i];
            if(!patWordMap.containsKey(c)){
                patWordMap.put(c, word);
            }
            else{
                if(!patWordMap.get(c).equals(word)) return false;
            }

            if(!wordPatMap.containsKey(word)){
                wordPatMap.put(word, c);
            }
            else{
                if(!wordPatMap.get(word).equals(c)) return false;
            }
        }

        return true;
    }
}