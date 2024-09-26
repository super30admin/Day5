// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet();
        if(s.length() != t.length())
            return false;
        for(int i = 0;i <s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar)){
                if(set.contains(tChar))
                    return false;
                map.put(sChar,tChar);
                set.add(tChar);
            }
            else if(map.get(sChar) != tChar)
                return false;
        }
        return true;
    }
}