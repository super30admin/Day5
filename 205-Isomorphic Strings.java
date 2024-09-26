//Time Complexity=O(N)
//Space Complexity=O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N0 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //We are initially checking whether the length of both string are equal or not
        if(s.length()!=t.length()) return false;
        
        //We are creating 2 hashMap to keep track of the character we have in our strings. 
        HashMap<Character,Character> in=new HashMap<>();
        HashMap<Character,Character> out=new HashMap<>();
        char[] st=s.toCharArray();
        char[] tt=t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            
               //If the character is repeated or is already in the hashMap then we are checking whether it has the same character corresponding to it, if not the return false  
            
            
            if(!in.containsKey(s.charAt(i)))
                in.put(s.charAt(i),t.charAt(i));
            if(in.get(s.charAt(i))!= t.charAt(i))
                return false;
            //We are adding all the letters intially as the come in our string 
            
            //We also have to check for the character from string t to s too, as if a character is pointing to two character in string s, the using only one hashMap would return true instead of false, example "ab" & "aa", which returns true if we use only one hashMap. 
            
            
            if(!out.containsKey(t.charAt(i)))
                      out.put(t.charAt(i),s.charAt(i));
            if(out.get(t.charAt(i))!=s.charAt(i))
                    return false;
        }
        return true;
    }
}