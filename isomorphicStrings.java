//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

public class isomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            //checking length of given s and t-base case
            if(s.length()!=t.length())
                return false;
            //initialize 2 hashmap for s and t with type character
            HashMap<Character, Character> sHashMap= new HashMap<>();
            HashMap<Character, Character> tHashMap= new HashMap<>();
            //going through the characters of s and t
            for(int i=0;i<s.length();i++){
                //if both the lengths are equal, then we take
                char sAlpha=s.charAt(i);
                char tAlpha=t.charAt(i);
                //checking in the sHashMap if sAlpha key is present or not, if not then
                if(!sHashMap.containsKey(sAlpha))
                    //then put that s and tAlpha into the hashmap
                    sHashMap.put(sAlpha, tAlpha);
                else
                    //if it does contain then check sAlpha is mapped to which tAlpha
                    if(sHashMap.get(sAlpha)!=tAlpha)
                        return false;
                //check if tHashMap doesnot contain tAlpha
                if(!tHashMap.containsKey(tAlpha))
                    //then put t and sAlpha into the hashmap
                    tHashMap.put(tAlpha, sAlpha);
                else
                    //if it does contain then check tAlpha is mapped to which sAlpha
                    if(tHashMap.get(tAlpha)!=sAlpha)
                        return false;
            }
            return true;
        }
    }
      
}
