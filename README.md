# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.


// Time Complexity : O( N * M log M)- where M is the length of the longest word to be sorted, N is input size
// Space Complexity : O(N* M) - for the character array used for sorting.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Syntax for converting a character array to string 


// Your code here along with comments explaining your approach
class Solution {
    private HashMap<String, List> map;
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<List<String>>();
        
        map = new HashMap<String, List>();
        
        for(String word : strs)
        {
            char[] word_arr = word.toCharArray();
            Arrays.sort(word_arr);
            //String sorted_word = word_arr.toString();
            String sorted_word = new String(word_arr);
            if(!map.containsKey(sorted_word))
            {
               map.put(sorted_word, new LinkedList());
            }
             map.get(sorted_word).add(word);
        }
        
        List<List<String>> result = new LinkedList<List<String>>();
        Iterator map_iterator = map.entrySet().iterator();
        
        System.out.println(map);
        while(map_iterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry) map_iterator.next();
            LinkedList<String> values = new LinkedList<String>((LinkedList<String>)mapElement.getValue());
            result.add(values);
        }
        
        return result;
    }
}

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

// Time Complexity : O(N)
// Space Complexity : O(1) -  only 26 characters are being stored at max - constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //1. Process both string from left to right 
        //2. key not found -> add to hashmap
        //3. key found -> check if it corresponds to what was seen before
        if(s.length() != t.length() ) return false;
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++)
        {
            char letter1 = s.charAt(i);
            char letter2 = t.charAt(i);
            
            
           if(!map.containsKey(letter1))
           {
               if(!map.containsValue(letter2))
                   map.put(letter1, letter2); // no key, no value ---> add to the map
               else
                   return false; // no key, yes value ---> the same value cannot be assigned to two different keys
           }
           else 
           {
               //if(!map.containsValue(letter2))
                //   return false;    // yes key, no value ---> the same key can't be mapped to two different values 
              
               if(map.get(letter1) != letter2 ) // yes key, yes value -> see if they are mapped to each other 
                   return false;
               
           }
           
        }
        return true;
        
    }
}

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
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

// Time Complexity : O(N) - N is number of words in the array
// Space Complexity : O(M) -  M = number of unique pairing pushed to hash map
// Did this code successfully run on Leetcode :  Yes
// Any problem you faced while coding this : No  


// Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s_arr = s.split(" ");
        
        if(pattern.length() != s_arr.length) return false;
        
        
        Map<Character, String> charToWord = new HashMap<Character, String>();
        Map<String, Character> wordToChar = new HashMap<String, Character>();
        
        
        for(int i=0; i<pattern.length(); i++)
        {
            char letter = pattern.charAt(i);
            String word = s_arr[i];
            
            
           if(!charToWord.containsKey(letter))
           {
               if(!wordToChar.containsKey(word))
               {
                   charToWord.put(letter, word); 
                   wordToChar.put(word, letter);
               }
               else
                   return false; // no key, yes value ---> the same value cannot be assigned to two different keys
           }
           else 
           {
               //if(!map.containsValue(letter2))
                //   return false;    // yes key, no value ---> the same key can't be mapped to two different values 
              
               if(!charToWord.get(letter).equals(word) ) // yes key, yes value -> see if they are mapped similiarly // don't use != or == for string comparison
                   return false;
               
           }
           
        }
        return true;
        
        
    }
}