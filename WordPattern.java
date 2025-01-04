// ## Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.


// Problem Name: 290. Word Pattern
// Leetcode problem Number : https://leetcode.com/problems/word-pattern/
// Solution:
// Time Complexity : O(nk) Here we are assuming that average length of a string is k and there are n strings. So to split a string to array of a strings it will take O(nk)
// Space Complexity : O(n) Here we are considering the space array will take. The space will be constant for the hashmaps as there will be limited no of entries as lowercase characters can be just 26 at max
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" "); //We are spliting a string based on spaces and inserting into an array
        //Base condition 
        if(str.length != pattern.length()){
            return false;
        }
        //Declaration of two hashmaps
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> strMap  = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String st= str[i];
            //If the map already contains a key then we will check it's value. If it doesn't exists then we will put it in a map
            if(charMap.containsKey(c)){
                if(!st.equals(charMap.get(c))){
                    return false;
                }
            }
            else{
                charMap.put(c,st);
            }
            //If the map already contains a key then we will check it's value. If it doesn't exists then we will put it in a map
            if(strMap.containsKey(st)){
                if(strMap.get(st)!=c){
                    return false;
                }
            }
            else{
                strMap.put(st,c);
            }


        }
        //If the iteration comes here that means the mapping is fine and we will return true.
    return true;

    }
}

//This can also be implemented with 1 hashmap and a hashset.