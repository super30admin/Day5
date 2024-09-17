  
// Time Complexity : O(N) N is the number of unique characters in the Strings.
// Space Complexity : O(K) Where K are the number of unique mappings of the characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
// One unique charater in the String S can map to only one unique charater in the String T.
// If the hashmap contains the character of S then that character must ap to a unique
// unique character in T.
// If the HashMap does not contain the character of S then the corresponding index's character in T
// must not be present in the HashMap as any value.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> hmap = new HashMap<Character,Character>();

        for(int i=0;i<s.length();i++)
        {
            char tempS = s.charAt(i);
            char tempT = t.charAt(i);
            if(hmap.containsKey(tempS))
            {
                if(hmap.get(tempS)!=tempT)
                {
                        return false;
                }
            }
            else if(hmap.containsValue(tempT)){
                return false;
            }
            
            hmap.put(tempS,tempT);
        }
        return true;
    }
}