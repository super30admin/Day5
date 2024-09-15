// Time Complexity : O(N)
// Space Complexity :O(1) As there would be 26 distint characters in the HashMap worst case
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1 Consider two HashMaps and one-one mapping of the characters in String s and String t
//2 If the character is not in the map then add it with it's corresponding value;
// 3 Similarly for the second map. 

import java.util.*;

public class Isomorphic {
    
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Character> sMap = new HashMap<>();
         HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!sMap.containsKey(c)){
                sMap.put(c,t.charAt(i));
            }
            if(!sMap.get(c).equals(t.charAt(i))) return false;
            
            
             if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),c);
            }
            if(!tMap.get(t.charAt(i)).equals(c)) return false;
        }
        
        
        
    return true;
        }
        
        public static void main(String args[]){
            Isomorphic obj=new Isomorphic();
            String s="paper";
            String t="title";
            System.out.println(obj.isIsomorphic(s,t));
        }
}