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

## Solution 1:
## Time Complexity:O(n(k+klogk)) SpaceComplexity:O(NXk) for sorting and every iteration and the length of string is also taken into account.
## Here I have used Hashmap approach where I am taking individual string from the array sorting it
## and then adding it as a unique key in the hashmap to which the values will be added as anagrams.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();


        for(String word:strs)
        {
            char[] temp=word.toCharArray();
            Arrays.sort(temp);
            String tempwo=String.valueOf(temp);

            if(!map.containsKey(tempwo))
            {
                map.put(tempwo,new ArrayList<>());
            }
            map.get(tempwo).add(word);
        }
        return new ArrayList<>(map.values());

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


## Solution 2:
## Time Complexity:O(n) and Space Complexity:O(1)
## I have used two arrays of fixed size where both arrays store the character to which they are mapped at their specific indexes.
## If the mapping matches correctly and no exceptions then the given strings will be isomorphic.



class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;
        char[] sset=new char[95];
        char[] tset=new char[95];
   

        for(int i=0;i<s.length();i++)
        {   char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sset[sChar-' ']!=0){
                if(sset[sChar-' ']!=tChar){
                    return false;
                }
            }
            else{
                sset[sChar-' ']=tChar;
            }


            if(tset[tChar-' ']!=0){
                if(tset[tChar-' ']!=sChar){
                    return false;
                }
            }
            else{
                tset[tChar-' ']=sChar;
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



## Solution 3:
## Time Complexity:O(n) and Space Complexity:O(1)
## I have used a hashmap and hashset over here , where hashmap checks and then maps.
## Hashset is used to confirm if the string has been previously mapped to any character.


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word_array=s.split(" ");
        if(pattern==null && s==null) return true;
        if(pattern==null || s==null) return false;
        if(pattern.length() != word_array.length) return false;
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();


        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(word_array[i]))
                return false;
            }
            else{
                if(set.contains(word_array[i]))
                return false;

                set.add(word_array[i]);
                map.put(c,word_array[i]);
            }


        }
        return true;
    }
}