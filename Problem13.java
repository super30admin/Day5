// Time Complexity : O(N), where N is length of String s
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // create a helper method that would be check each char in s and t and reverse
        return check(s, t) && check(t, s);
    }

    public boolean check(String a, String b){
        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        int l = a.length();
        while (i < l){
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            if (map.containsKey(aChar)){
                if (map.get(aChar) != bChar) return false;
            }
            else map.put(aChar, bChar);
            i++;
        }
        return true;
    }
}