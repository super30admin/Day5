// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            if(map1.containsKey(s.charAt(i))&& map2.containsKey(t.charAt(i))){
                if(map1.get(s.charAt(i)) == t.charAt(i) && map2.get(t.charAt(i))==s.charAt(i)) {
                    continue;
                }
                else 
                    return false;
            }
            else if(!map1.containsKey(s.charAt(i))&& !map2.containsKey(t.charAt(i))) {
                map1.put(s.charAt(i),t.charAt(i));
                map2.put(t.charAt(i),s.charAt(i));
            }
            else
                return false;
        }
        return true;
    }
}