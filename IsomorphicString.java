/*
-Time Complexity : O(n) length of any string
-Auxiliary Space : O(1)  we are using constant space, in the worst case we will be storing only 26 chars which is nothing if our string is very large.
-Did this code successfully run on Leetcode :Yes
-Any problem you faced while coding this : No
-Your code here along with comments explaining your approach
    1. I am using hashmap to map each character in the s string to the character in t string. 
    2. I am also using hashset to store the characters which we have already mapped with character in the 1st string.
    3. For every character in s string I will check if this character is already mapped,
        1. if yes, then I will verify if the its mapping with character in t string is same as current mapping. if not            then, return false from there.
        2. if mapping not found then, I will check if character in string t is already mapped ( by checking if it is                present in the hashset) if is already mapped , that means that character is mapped to some other character in            string s, so return false from there
        3. else add entry in the map as well add character in string t in the hashset.
        
*/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
       if(s.length() !=  t.length())
           return false;
        //to store mapping of s-t
       Map<Character, Character> map= new HashMap<>();
        //to store already mapped character of String t
       Set<Character>set = new HashSet<>();
        
       for(int i=0; i< s.length(); i++){
           //if current character in String s is not yet mapped,
           if(!map.containsKey(s.charAt(i))){
               //check if character in String s is not yet mapped, 
               //if it is then it must have been mapped to different character, so return false
               if(set.contains(t.charAt(i)))
                   return false;
               //else add character in String t into set to know that this char is mapped now.
               set.add(t.charAt(i));
               //add s-t mapping in the hashmap.
               map.put(s.charAt(i),t.charAt(i));
           }           
           else
                //if current character in String s is already mapped then check if it is mapped to same char in the t
                // if not then return false.
                if(map.get(s.charAt(i)) !=  t.charAt(i))
                   return false;
       }
       return true;
    }
}
