// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// 290. Word Pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" "); 
        if(pattern.length() == 0 || s.length() == 0) return false;
        if (pattern.length() != strs.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            String str = strs[i];
            if(map.containsKey(a)){
                if(!map.get(a).equals(str)){
                    return false;
                }
            }
            else{
                if(set.contains(str)){
                    return false;
                }
                map.put(a,str);
                set.add(str);
            }
        }
        return true;
    }
}