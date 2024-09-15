// Time Complexity : O(N) where N is the number of characters in either strings
// Space Complexity : O(2N) where N is the number of characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
1. We are creating 2 hashmaps one to store mapping from s -> t and the other for t -> s
2. Everytime we get a char s and a char in t we compare both to both hashmaps
3. If they are present and map to the same values then we ignore
4. If they are present and map to different value then we return false
5. If we pass all the test cases without any errors then we return true
*/

// Solution:

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i=0;i<s.length();i++) {
            if(tMap.containsKey(t.charAt(i)))
                System.out.println(tMap.get(t.charAt(i)) != s.charAt(i));
            if(!sMap.containsKey(s.charAt(i)) && !tMap.containsKey(t.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
            }
                
            else if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) != t.charAt(i))
                return false;
            else if(tMap.containsKey(t.charAt(i)) && tMap.get(t.charAt(i)) != s.charAt(i))
                return false;
            
        }
        return true;
    }
}
