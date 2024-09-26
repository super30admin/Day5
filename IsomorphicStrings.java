// Time Complexity : best case - O(N)
// Space Complexity : O(N) - N size of HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map1 = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2) return false;
            }
            else{
            if(!map1.containsValue(c2)){
                map1.put(c1,c2);
            }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}