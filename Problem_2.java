// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// 205. Isomorphic Strings
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b){
                    return false;
                }
            }
            else{
                if(set.contains(b)){
                    return false;
                }
                map.put(a,b);
                set.add(b);
            }
        }
        return true;
    }
}