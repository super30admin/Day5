//Problem: leetcode 205. Isomorphic Strings. 
//Problem Link: https://leetcode.com/problems/isomorphic-strings/
// Time Complexity : O(n)
// Space Complexity :O(2*l)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Approach
/*

1. Traverse through both the strings. 
2. Store the characters of one string(say s) in a map and its corresponding values will be the characters 
at the same position in the other string(say t).
3. Step 2 for the other string i.e store the charactes of string t as keys and its corresponding values will be the 
characters at the same position in the other string s.
4. At each iteartion after storing the character and its value in both the maps, check if the if the 
value of the character of one string is same as the character in the other string.
5. if either of the values from either of the map does not match , then its not isomorphic. Return false.

*/



import java.util.*;
class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap< Character, Character>();
        HashMap<Character, Character> map2 = new HashMap< Character, Character>();
            for(int i=0;i<s.length();i++){
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if(!map1.containsKey(c1)){
                    map1.put(c1, c2);
                }
                
                if(!map2.containsKey(c2)){
                    map2.put(c2, c1);
                }
                
       
                if(map1.get(c1) != c2 || map2.get(c2) != c1){
                        return false;
                }
                 
            }
            
            return true;
        
        
    }
}