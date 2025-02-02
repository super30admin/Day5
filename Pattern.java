// Overall Time Complexity : O(n + N). The n is number of characters in the pattern.
// Overall Space Complexity : O(n+1) ie O(n). The space complexity is n  number of words in the string.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

// For each string, calculate its prime product by mapping characters to primes.
// Store the prime product as the key and group the strings with the same prime product in a HashMap.
// Finally, return the grouped anagrams as a list of lists.

import java.util.*;
class Pattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<Character, String> ptw = new HashMap<>();
        HashMap<String, Character> wtp = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String wd = words[i];
            
            if(ptw.containsKey(ch)){
                if(!ptw.get(ch).equals(wd)) return false;
            }
            else{
                if(wtp.containsKey(wd)){
                    if(!wtp.get(wd).equals(ch)) return false;
                }
            }
            ptw.put(ch,wd);
            wtp.put(wd,ch);
           
    }
    return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String newStr = "dog dog dog dog";
        System.out.println(wordPattern(pattern, newStr)); // 
    }
}