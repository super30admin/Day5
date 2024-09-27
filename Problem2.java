//## Problem 2:
//Given two strings s and t, determine if they are isomorphic.
//Two strings are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

//Example 1:
//Input: s = "egg", t = "add"
//Output: true

//Example 2:
//Input: s = "foo", t = "bar"
//Output: false

//Example 3:
//Input: s = "paper", t = "title"
//Output: true
//Note:
//You may assume both s and t have the same length.

// Time Complexity: O(N)
// Space Complexity: O(N)

public class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> stot = new HashMap<>();
        HashMap<Character, Character> ttos = new HashMap<>();
        
        for (int x = 0; x<s.length(); x++){
            char cs = s.charAt(x);
            char ct = t.charAt(x);
            
            if(stot.containsKey(cs) && stot.get(cs) != ct){
                return false;
            }
            else{
                stot.put(cs,ct);
            }
            
            if(ttos.containsKey(ct) && ttos.get(ct) != cs){
                return false;
            }
            else{
                ttos.put(ct,cs);
            }
        }
        
        return true;
    }
}
