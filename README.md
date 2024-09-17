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
//Time Complexity : O(n+logk)
//Space Complexity : O(1)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //take hashmap of string and array list
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            //for each word in string sort it first
            char [] str = s.toCharArray();
            Arrays.sort(str);
            String sorted = String.valueOf(str);
            //if doesnt map contain sorted word as key
            if(!map.containsKey(sorted)){
                //put in map the sorted word and create new list
                map.put(sorted , new ArrayList<>());
          
            }
            //if it contains the sorted word add the word to corresponding list
                     map.get(sorted).add(s);
        }
        //return the arraylist from map which are the values
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
//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if strings are different length => different words 
        //return false
       if(t.length()!=s.length()) return false;
        if(s==null || t==null)return false;
        //Create two hashmaps
        //Smap sourcemap with sourcechars, targetchars
        //Tmap targetmap with targetchars, sourcechars
        HashMap<Character,Character> Smap = new HashMap<>();
        HashMap<Character,Character> Tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char Schar = s.charAt(i);
           char Tchar = t.charAt(i);
            //if Smap doesnt contain Schar source char 
            //put it into map with its corresponding target char
            if(!Smap.containsKey(Schar)){
             Smap.put(Schar,Tchar);   
            }
            else{
                //if contains in Smap then check if the value of source char is equal to given tchar if not return false
                if(Smap.get(Schar)!=Tchar) return false;
                
            }
             //if Tmap doesnt contain Tchar  target char 
            //put it into map with its corresponding source char
            if(!Tmap.containsKey(Tchar)){
                Tmap.put(Tchar,Schar);
            }
            else{
                //if contains in Tmap then check if the value of target char is equal to given Schar if not return false
                if(Tmap.get(Tchar)!=Schar) return false;
            }
            
        }
        //if all cases fail return true
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
//Time Complexity : O(N)
//Space Complexity : O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String st[] = s.split(" ");
        if(st.length != pattern.length()) return false;
        if(s==null || pattern==null) return false;
        HashMap <Character, String> chars = new HashMap();
        HashMap <String, Character> word = new HashMap();
        
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String ss = st[i];
            //if the map doesnt contain the char
            if(!chars.containsKey(ch)){
                //But the word exists in word map for different char
                //return false
               if(word.containsKey(ss)) return false;
                else{   
                    //doesnt contain in both maps so put in maps
                    chars.put(ch,ss);
                    word.put(ss,ch);
                    }
            }
              
            else{ 
                //if the map contains char but mapped to different word
                //return false
               if(!(chars.get(ch).equals(st[i])))return false;
            }
            
        }//else if everything is correct return true
        return true;
    }
        
}