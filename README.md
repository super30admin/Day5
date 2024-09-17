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


## Problem 1 Solution :

// Time Complexity : O(ln)
// Space Complexity : O(n) since new hashmap is used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

Approach-1: 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        if(strs ==null || strs.length==0 ) return new ArrayList<>(); //if the string array is empty, new null 
        
        HashMap <Long, List<String>> map= new HashMap<>(); //new auxillary hashmap to store the anagrams
        
        for(String str:strs)
        { 
            long PrimeFactor= PrimeFactor(str); //calculate the prime factor of each word in long 
            
            if(!map.containsKey(PrimeFactor)) // if our hashmap does not contains that word 
            {
                map.put(PrimeFactor,new ArrayList<>()); // then put that long value and create a list to store the words having same long 
            }
        map.get(PrimeFactor).add(str); //add the string word to that long value
        }
        
        return new ArrayList<>(map.values());
    }
    
    private long PrimeFactor(String s){
        long result=1; 
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103}; // 26 prime values
        for(int i=0; i<s.length();i++)
        {
            char c= s.charAt(i);
            result= result * primes[c - 'a']; //get the unique value 
        }
        
        return result; 
    }
}

Approach-2: 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        if(strs ==null || strs.length==0 ) return new ArrayList<>(); //if the string array is empty, new null 
        
        HashMap <String, List<String>> map= new HashMap<>(); //new auxillary hashmap to store the anagrams
        
        for(String str:strs)
        { 
           
            char[] charArray= str.toCharArray(); //split the characters
            Arrays.sort(charArray); //sort the char array 
            String sorted= String.valueOf(charArray); //put the sorted char array back to a string
                
            if(!map.containsKey(sorted)) // if our hashmap does not contains that word 
            {
                map.put(sorted,new ArrayList<>()); // then put that sorted word and create a list to store the words having same characters 
            }
        map.get(sorted).add(str); //add the string word to its sorted key 
        }
        
        return new ArrayList<>(map.values());
    }
}

## Problem 2 Solution:

// Time Complexity : O(l) //length of the string
// Space Complexity : O(n) since new hashmap is used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>(); //first hashmap for s to t mapping 
        HashMap<Character, Character> tmap = new HashMap<>(); // second hashmap for t to s mapping 
        
        if(s.length()!=t.length()) return false; //if both the string does not have the same length, return false
        
        for(int i=0; i< s.length(); i++) //iterate over the string length 
        {
            char schar= s.charAt(i); //get the first char of the string s
            char tchar= t.charAt(i); // get the first char of the string t
            
            if(!smap.containsKey(schar)) //if the smap does not contain schar
            {
                smap.put(schar,tchar); // then add it to smap 
            }
            else
            {
                if(smap.get(schar)!=tchar) // else if it already present, check if it is equal to tchar
                {
                    return false; //return false
                }
            }
            
              if(!tmap.containsKey(tchar)) //check the same if tmap  
            {
                tmap.put(tchar,schar);
            }
            else
            {
                if(tmap.get(tchar)!=schar)
                {
                    return false; 
                }
            }
        }
        return true; 
    }
}

## Problem 3 Solution:

// Time Complexity : O(l) //length of the string
// Space Complexity : O(n) since new hashmap is used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

class Solution {
    public boolean wordPattern(String pattern, String s) {
         
        
        HashMap< Character , String> myMap = new HashMap<>(); //Hashmap to store the pattern and string
    
        String[] myString= s.split(" "); //convert the string to individual words
        char[] myChar= pattern.toCharArray(); //convert the pattern to individual characters
        if(myString.length != pattern.length()) return false; //return false if pattern length does not match the word length 
       
        
        for(int i=0; i< myString.length; i++) 
        {   
            if(myMap.containsKey(myChar[i])) //if my map contains the char key 
            {
                if(!myMap.get(myChar[i]).equals(myString[i])) // we will check if it's value is equal to the first word in the string array
                {
                    return false; //if not return false
                }
            }
            else{
                
                if(myMap.containsValue(myString[i])) //check if the value is already some other key's value or not
                {
                    return false; // if yes, return false
                }
                myMap.put(myChar[i], myString[i]); //otherwise add it in the hashmap 
            }
        }
        return true; // return true if matches
    }
}