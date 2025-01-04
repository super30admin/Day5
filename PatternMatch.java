/* Description: Declaring 2 HashMaps; one for pattern->string mapping & second for string->pattern mapping. So,
every time we find that it is already present, we compare if it is equal to the value that we going to store,
if not than return false, else do nothing. In the end, return true if false statement is not executed and it comes out of for loop.
 */
// Time Complexity : O(nk) - Given input string we are splitting into array of size n and assume length of each string in array goes upto size k. Therefore, complexity O(nk)
// Space Complexity : O(n) - (No matter the size of input, the number of characters we have is only a-z/A-Z/Special chars i.e. constant. But in this case, we are not storing characters in hashmap, we are storing different input strings, and strings can be many, in worst case suppose strings given are 10^6, so that's why space complexity O(n))
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Splitting the input string into list of strings
        String[] strArray = s.split(" ");
        /*
         * Declaring hashmap for storing pattern(note single character in a pattern
         * corresponds to one string in array) to string mapping
         */
        HashMap<Character, String> patternMap = new HashMap<>();
        /*
         * Declaring hashmap for storing string(note one string in a list corresponds to
         * single character in pattern) to pattern mapping
         */
        HashMap<String, Character> strMap = new HashMap<>();
        /*
         * Checking base condition - If length of pattern and the list of strings is not
         * equal, that means no match
         */
        if (pattern.length() != strArray.length) {
            return false;
        }
        // Running a loop for each character/each string
        for (int i = 0; i < pattern.length(); i++) {
            // Getting a single character from pattern(since single char --> one string)
            char chr = pattern.charAt(i);
            // Getting a first string from list(since one string --> single char)
            String str = strArray[i];
            // Checking if the single char --> one string mapping is already present,
            if (patternMap.containsKey(chr)) {
                /*
                 * If contains, further check if the value of that key(char) is not the current
                 * string that we have in str
                 */
                if (!str.equals(patternMap.get(chr))) {
                    // Then return false
                    return false;
                }
            }
            // Else if does not contain, add a entry(char,str)
            else {
                patternMap.put(chr, str);
            }
            // Similarly, check if the string --> single char mapping is already present,
            if (strMap.containsKey(str)) {
                /*
                 * If present, further check if the value of that key(string) is not the current
                 * char that we have in chr
                 */
                if (strMap.get(str) != chr) {
                    // Then return false
                    return false;
                }
            }
            // Else if does not contain, add a entry(str,char)
            else {
                strMap.put(str, chr);
            }
        }
        /*
         * If none of the return false statement is executed and it comes out of the
         * loop, that mean there is a match, return true
         */
        return true;
    }
}