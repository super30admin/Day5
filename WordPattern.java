// Time Complexity : O(n^2), n is length of pattern. 
// for loop --- n || containsValue --- n . Therefore total runtime is O(n^2)
// Space Complexity : 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if(pattern.length() != s.length) return false;

        Map<Character, String> map = new HashMap<>();
               
        for (int i = 0; i < pattern.length(); i++) {
            
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(s[i]) ) continue;
                else return false;
            }
            else {
                if(!map.containsValue(s[i])) {
                    map.put(pattern.charAt(i),s[i]);
                    continue; 
                }
                else return false;
            }
        } return true; 
    }
}