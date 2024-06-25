// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used a hashmap to maintain the pattern
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i))!= t.charAt(i)) return false;
            }
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
