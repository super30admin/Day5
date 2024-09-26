//Time complexity=O(Nk)
//Space Complexity=O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N0 


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        
        //Base case if the length of both the string is not same then return false
        if(pattern.length()!=s.length)
            return false;
        //We are stroing 2 hashMap to keep track of character to word and word to character correspondance
        HashMap<Character, String> map=new HashMap<>();
        HashMap<String,Character> smap=new HashMap<>();
       for(int i=0;i<pattern.length();i++)
       {
           //If map does not contain the element then add the element and add its words in the hashmap
           //similarly for 2nd hashmap
           
           if(!map.containsKey(pattern.charAt(i)))
                map.put(pattern.charAt(i),s[i]);
           if(!smap.containsKey(s[i]))
                smap.put(s[i],pattern.charAt(i));
           
           //If a character is repeated then we check if its word is similar to that in hashmap 
           
           if(!map.get(pattern.charAt(i)).equals(s[i]) || !smap.get(s[i]).equals(pattern.charAt(i)))
               return false;
           
           
       }
        return true;
    }
}