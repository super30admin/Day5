# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1: Anagram Strings

```Java
// Time Complexity : O(nklogk) where n=total number of words, k=avg length of words
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
```

## Problem 2: Isomorphic Strings

```Java
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Aproach 1: using two hashmaps
      
        //data validation
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        //checking for smap
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            //check if smap contains the char at i 
            if(smap.containsKey(schar)){
                //check if 1st char in smap is mapped to 1st char in tmap
                if(smap.get(schar) != tchar){
                    return false;
                }
            }
            else{
                smap.put(schar, tchar);
            }
            //check if tmap contains the char at i 
            if(tmap.containsKey(tchar)){
                //check if 1st char in tmap is mapped to 1st char in smap
                if(tmap.get(tchar) != schar){
                    return false;
                }
            }
            else{
                tmap.put(tchar, schar);
            }
        }
        return true;
    }
}
```

## Problem 3:
```Java
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> map_char = new HashMap();
        HashMap <String, Character> map_word = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!map_char.containsKey(c)) {
                if (map_word.containsKey(w)) {
                    return false;
                } else {
                    map_char.put(c, w);
                    map_word.put(w, c);
                }

            } else {
                String mapped_word = map_char.get(c);
                if (!mapped_word.equals(w))
                    return false;
            }
        }

        return true;
    }
}
```