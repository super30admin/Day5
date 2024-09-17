// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap();
        String[] strs = s.split(" ");
        Set<String> set = new HashSet();
        
        if(pattern.length() != strs.length)
            return false;
        
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(strs[i]))
                    return false;
            } 
            else {
                if(set.contains(strs[i]))
                    return false;
                map.put(ch, strs[i]);
                set.add(strs[i]);
            }
        }
        return true;
    }
}