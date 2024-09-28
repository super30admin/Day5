import java.util.HashMap;
import java.util.Map;

/*******
## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (205. Isomorphic Strings)
Any problem you faced while coding this :       No
*******/

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        // create 2 maps s->t and t->s mapping
        HashMap<Character, Character> s_map = new HashMap<>();
        HashMap<Character, Character> t_map = new HashMap<>();
        
        for (int i=0; i< s.length(); i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            
            // store s->t 1:1 mapping in s_map
            if( s_map.containsKey(s_char) ){
                // if already present, then check the values
                // if existing mapping is different than new mapping, return false
                if (s_map.get(s_char) != t_char){
                    return false;
                }
            }
            else{
                // else create new mapping
                s_map.put(s_char,t_char);
            }
            
            // store t->s 1:1 mapping in s_map
            if( t_map.containsKey(t_char) ){
                // if already present, then check the values
                // if existing mapping is different than new mapping, return false
                if (t_map.get(t_char) != s_char){
                    return false;
                }
            }
            else{
                // else create new mapping
                t_map.put(t_char,s_char);
            }
        }
        return true;
    }

    public static void main(String args[]) 
    { 
        Isomorphic obj = new Isomorphic();
        String s = "foo", t = "bar";
        System.out.println(obj.isIsomorphic(s, t));
    }
}
