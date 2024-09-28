import java.util.HashMap;

/*******
## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Time Complexity :   O (N) 
Space Complexity :  O (N) 
Did this code successfully run on Leetcode :    Yes (290. Word Pattern)
Any problem you faced while coding this :       No
*******/

class MywordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // if length are not equal
        if (words.length != pattern.length())
            return false;

        // create 2 mappings map char->word and word->char
        HashMap<Character, String> char_map = new HashMap<>();
        HashMap<String, Character> word_map = new HashMap<>();

        for(int i =0; i < words.length; i++){
            char c = pattern.charAt(i);
            String w = words[i];

            // if char_map does not have key present
            if(!char_map.containsKey(c)){
                // check if word_map contain key for that mapped word
                if(word_map.containsKey(w))
                    return false;
                // add the entries in both maps
                else{
                    char_map.put(c, w);
                    word_map.put(w, c);
                }
            }
            // if key is present, compare the values
            else{
                if (!char_map.get(c).equals(w)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) 
    { 
        MywordPattern obj = new MywordPattern();
        String pattern = "abba", s = "dog cat cat a";
        System.out.println(obj.wordPattern(pattern, s));
    }
}
