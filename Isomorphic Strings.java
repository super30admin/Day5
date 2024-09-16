// Time Complexity : O(n) n is length of given string
// Space Complexity : O(1) At max we can have 26 entries in both HashMap and HashSet.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Create a HashMap and HashSet and use HashMap to track mappings from word 
// s to t and HashSet to track letters used up in t because there can be an 
// invalid mapping from t to s.

class Solution {
    HashMap<Character,Character> m = new HashMap<Character,Character>();
    HashSet<Character> c = new HashSet<Character>();
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        for(int i=0;i<length;i++){
            if(m.containsKey(s.charAt(i))){
                if(m.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(c.contains(t.charAt(i))){
                    return false;
                }
                m.put(s.charAt(i),t.charAt(i));
                c.add(t.charAt(i));
            }
        }
        return true;
    }
}