// Time Complexity : Only one for loop runs through the length of the entire string. All other Hashmap operations are O(1). So, Asymtotically, in the order of O(n)
// Space Complexity : O(1) - Because the hashmap in the worst case can have no more than 26 entries (for 26 alphabets). So that is constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

import java.util.*;
import java.lang.String;
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) { 
        if(s.length() != t.length()) return false;  //edge case when the two strings are not of equal length
        HashMap<Character, Character> sMap = new HashMap<>(); 
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i =0; i < s.length(); i++)
        {  //iterate through the length of the strings
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(!sMap.containsKey(s_char)) 
            {   //if character in left string is not present in the left hashmap, put it with character at right string as corresponding value
                sMap.put(s_char, t_char);  
            }
            else{
                if(sMap.get(s_char) != t_char)
                {  //duplicate entries for same character. Hence, return false
                    return false;
                }
            }
            if(!tMap.containsKey(t_char))
            {//if character in right string is not present in the right hashmap, put it with character at left string as corresponding value
                 tMap.put(t_char, s_char);
            }
            else{
                if(tMap.get(t_char) != s_char)
                { ////duplicate entries for same character. Hence, return false
                    return false;
                }
            }
        }
        return true;  //if no problem encountered, return true and exit
    }
}

//Main Class
class Main
{
    public static void main(String[] args)
    {
    IsomorphicStrings obj = new IsomorphicStrings();
    String s = "egg";
    String t = "add";
    System.out.print("\nAre Strings " + s + " and " + t + " Isomorphic? - " + obj.isIsomorphic(s,t));
    s = "foo";
    t = "bar";
    System.out.print("\nAre Strings " + s + " and " + t + " Isomorphic? - " + obj.isIsomorphic(s,t));
    System.out.print("\n");
    }
}