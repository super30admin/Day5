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


 public List<List<String>> groupAnagrams(String[] strs) {



       HashMap <String,List<String>> map = new HashMap<>();



       for(int i = 0; i < strs.length; i++){



           char[] c = strs[i].toCharArray();



           Arrays.sort(c);



           String sortedWord = String.valueOf(c);



           if(!map.containsKey(sortedWord)){



               map.put(sortedWord, new ArrayList<String>());



           }



           map.get(sortedWord).add(strs[i]);



       }



       return new ArrayList<List<String>>(map.values());



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

class Solution {

   public boolean wordPattern(String pattern, String str) {

       String[] arr= str.split(" ");

       int n = arr.length;

       int k = pattern.length();

       if(n != k) return false;

       HashMap <Character, String> pMap = new HashMap<Character, String>();

       HashMap <String, Character> sMap = new HashMap<String, Character>();

       for (int i = 0; i < n; i++){

           char a = pattern.charAt(i);

           if(!pMap.containsKey(a)){

               pMap.put(a,arr[i]);

           } else {

                if (!pMap.get(a).equals(arr[i])) return false;

           }

           if(!sMap.containsKey(arr[i])){

               sMap.put(arr[i],a);

           } else {

               if (!sMap.get(arr[i]).equals(a)) return false;

           }

       }

       return true;

   }

}
