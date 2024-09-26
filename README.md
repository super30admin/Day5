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

T.C O(NK) where k is length of each string and n is number of strings
S.C : O(NK)
class Solution {
public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<Double,List<String>> map = new HashMap<>();

        for(String str : strs)
        {


            double primeValue = getProduct(str);
            if(!map.containsKey(primeValue))
            {
                map.put(primeValue,new ArrayList<>());
            }

            map.get(primeValue).add(str);
        }

        return new ArrayList<>(map.values());

    }

    private double getProduct(String str)
    {
        int[] prime={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        double mult = 1;
        for(int i=0; i<str.length(); i++)
        {
           char c = str.charAt(i);
           mult = mult * prime[ c - 'a'];
        }

        return mult;
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

T.C -- O(N)
S.C -- O(1)

class Solution {
public boolean isIsomorphic(String s, String t) {
char[] sc = s.toCharArray();
char[] tc = t.toCharArray();
int[] ms = new int[256];
int[] mt = new int[256];
Arrays.fill(ms, -1);
Arrays.fill(mt, -1);

       for(int i =  0; i < sc.length; i++){
          int is = sc[i];
          int it = tc[i];
          if(ms[is] != mt[it]) return false;
          ms[is] = i;
          mt[it] = i;
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

T.C O(M) where M is number of characters in pattern
s.c O(M) where M is words in string

class Solution {
public boolean wordPattern(String pattern, String s) {

        HashMap<String,Character> sTow = new HashMap<>();
        HashMap<Character,String> wTos = new HashMap<>();

        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        for(int i=0; i<str.length; i++)
        {
            char c = pattern.charAt(i);
           if( !wTos.containsKey(c))
           {
              if(sTow.containsKey(str[i]))
               {
                  return false;
               }

            else
            {
            wTos.put(c,str[i]);
            sTow.put(str[i],c);
            }
           }

     else {
            String mapped_word = wTos.get(c);
            if(!mapped_word.equals(str[i]))
                return false;

        }

        }
        return true;
    }

}
