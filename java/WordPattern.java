//Problem
290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true


// Time Complexity :  O(N2) N square as we need to iterate through each char of the input string and map.containsValue(val) checks for all entries which is another O(N)
// Space Complexity : O(1) as it can have only 256 possible ASCII characters
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Map character of each pattern to each word of s in HasMap and if key already exists check whether its value is equal to the word at that position or not.
if there is no entry of key, then check if value of word exists in map then return false or else insert new key and value;
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()==0 || s.length()==0) return true;
        String[] words = s.split(" ");
        if(pattern.length()!= words.length) return false;
        Map<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String cString = String.valueOf(c);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i]))
                    return false;
                else continue;

            } else {
                if(map.containsValue(words[i]))
                    return false;
                 map.put(c, words[i]);
            }
        }
        return true;
    }
}