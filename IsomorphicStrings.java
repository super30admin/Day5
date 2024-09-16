// Time Complexity : O(N) N - number of chars in any one of the input strings
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
// The basic idea is to maintian a key value mapping for each characters in both the given input strings
// I also used a hashset to store the characters that are already mapped as this helps in avoiding the map.containsValue() check which has O(N) Time complexity
// If there is a mismatch in any character key value pair for both the input strings return false else return true
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();   

        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(!map.containsKey(sChar)) {
                if(!set.add(tChar)) {         // returns false if the element being added is already present in the set else adds the element to the set
                        return false;
                } else {
                    map.put(sChar,tChar);
                }
            } else {
                if(map.get(sChar) != tChar)
                    return false;
            }
        }
            
        return true;
    }
}