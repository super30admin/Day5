// Time Complexity : O(n) - where n is the number of elements in the strings
// Space Complexity : O(26+26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Using 2 character arrays in place of a hashmap to map the characters to one another.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length()!=t.length()) return false;
        if(s==null || t==null) return false;
        //hashing index char ASCII VALUE- ASCII of very first ascii.
        //c-'a'=99-97
        //Map<Character,Character> sMap=new HashMap<>();
        //Set<Character> hset=new HashSet<>();
        char [] sMap=new char[100];
        char [] tMap=new char[100];
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap[sChar - ' '] !=0){
                if(sMap[sChar - ' '] !=tChar) return false;
            }
            else{
                    sMap[sChar - ' '] =tChar;
                }
      if(tMap[tChar - ' '] !=0){
            if(tMap[tChar - ' '] !=sChar) return false;
               }
            else{
                    tMap[tChar - ' '] =sChar;
                }
            }
        return true;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(26+26)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Using a hashmap to map the characters to one another. We use two hashmaps to reducte the complexity.(if we use one hashmap we need to use .contains() - which is asymptotically O(n) for each operation.)


class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length()!=t.length()) return false;
        if(s==null || t==null) return false;
        
        Map<Character,Character> sMap=new HashMap<>();
        Set<Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) !=tChar) return false;
            }
            else{
                    if(hset.contains(tChar)) return false;
                    sMap.put(sChar,tChar);
                    hset.add(tChar);
                }
            }
        return true;
        }
    }

// Time Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length()!=t.length()) return false;
        if(s==null || t==null) return false;
        
        Map<Character,Character> sMap=new HashMap<>();
        Set<Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) !=tChar) return false;
            }
            else{
                    if(hset.contains(tChar)) return false;
                    sMap.put(sChar,tChar);
                    hset.add(tChar);
                }
            }
        return true;
        }
    }
