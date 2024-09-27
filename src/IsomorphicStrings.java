//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :

/**
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * Given two strings s and t, determine if they are isomorphic.

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
 */

import java.util.Arrays;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        //array to maintain mapping from s -> t
        int[] map = new int[256];
        Arrays.fill(map, -1);
        
        //boolean array to maintain visited chars in t
        boolean[] visited = new boolean[256];
       
        for(int i=0; i< s.length();i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            
            if(map[c] == -1){
              /* if c is seen first time then
                 d also should be seen first time,
                 if d occured already then strings non isomorphic
              */
              if(visited[d] == true) {
                  return false; 
              }
              
              //mark d as visited
              visited[d] = true;  
              map[c] = d;
            } else if(map[c] != d) {
                return false;
            }
        }
        
        return true;
    }
}