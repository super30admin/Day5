/*
   
Isomorphic strings
*/

// Time Complexity :  O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Solution {
    public boolean isIsomorphic(String s, String t) {
      int  len=s.length();
        if(len==0) return true; 
        HashMap<Character, Character> map= new HashMap<Character,Character>();
        for(int i=0; i<len;i++)
        { 
          char ch1=t.charAt(i); 
          char ch2=s.charAt(i);
          if(map.containsKey(ch1))  
          {
            char temp=map.get(ch1);
             if(temp!=ch2) 
              return false; 
          }
          else if(map.containsValue(ch2))
          {
              return false;
          } 
          else 
          {
              map.put(ch1,ch2);
          } 
            
        }
        return true;
    }
    }