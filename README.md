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

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            //sort the string
            char [] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);

        }
        return new ArrayList<>(map.values());
    }
}

time complexity = O(n)
space complexity = O(1)

class Solution{
    int [] prime;
     public List<List<String>> groupAnagrams(String[] strs) {
        this.prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s:strs){
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    private double primeProduct(String s){
        double result = 1;
        for(int i=0; i < s.length(); i++){
            char c= s.charAt(i);
            result = result*prime[c-'a'];
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
time complexity = O(n)
space complexity = O(1)

 class Solution {
    public boolean isIsomorphic(String s, String t) {
       int sl = s.length(); int tl = t.length();
       if(sl!=tl) return false;
       HashMap <Character, Character> sMap = new HashMap<>();
       HashMap <Character, Character> tMap = new HashMap<>();
       for(int i=0; i < sl; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                    sMap.put(sChar, tChar);
            }
                 
                if(tMap.containsKey(tChar)){
                    if(tMap.get(tChar) != sChar){
                        return false;
                    }
                } else{
                    tMap.put(tChar, sChar);
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
time
time complexity = O(n)
space complexity = O(1)

class Solution {
    public boolean wordPattern(String pattern, String s) {
     
    String[] arr = s.split(" ");
    if(arr.length != pattern.length()) return false;
    HashMap <Character, String> map1 = new HashMap<>();
    HashMap < String, Character> map2 = new HashMap<>();
    for (int i=0; i < pattern.length(); i++){
        char c= pattern.charAt(i);      
        if(map1.containsKey(c)){
            if(!arr[i].equals(map1.get(c))){
                return false;
            }
        } else{
            map1.put(c, arr[i]);
        }

        if(map2.containsKey(arr[i])){
            if(c != map2.get(arr[i])){
                return false;
            }
        } else{
            map2.put(arr[i],c);
        }      
            

    }
    return true;
    }
}
