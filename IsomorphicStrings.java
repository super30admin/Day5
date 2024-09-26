//time complexity : O(n) where n is the length of the string and we are iterating through n characters of each string.
//space complexity : O(n), in worst case, we will be storing n characters as keys in the hashmap
//any issues coding this: none
//executed on leetcode :  yes
//approach : 1. if length of both strings in unequal, they cant be isomorphic, so we return false
// 2. we use a hashmap to store the charatcer mappings. we iterate through both the strings.
//3. if the map doesnt contain charater of string s, we check if the corresponding character is already present if yes , then it would mean two chars of string s map to the same char in string t, so we return false
// else we add mapping to the hashmap
//4. if the character of string s is already present in hashmap, we check whether this character is mapping to two different chars in string t, if yes we return false.

import java.util.*;
class Isomorphic{
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0;i<s.length();++i)
        {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(!map.containsKey(key))
            {
                if(!map.containsValue(value)) map.put(key,value);
                else return false;
            }
            else 
            {
                if(value!=map.get(key)) return false;
            }
        }
        return true;   
    }
    public static void main(String[] args)
    {
        String s = "egg";
        String t = "fog";
        System.out.println("are "+s+" and "+t+" isomorphic? :"+isIsomorphic(s, t));
    }
}