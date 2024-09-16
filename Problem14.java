// Time Complexity : O(N), where N is length of String s
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // split string and check if each String in array and its corresponding char in s are equal
        String[] strs = s.split(" ");

        if(strs.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0;i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (map.containsKey(ch)) {
                if(!map.get(ch).equals(strs[i])) {
                    return false;
                }
            } else {
                if(map.containsValue(strs[i])) {
                    return false;
                }
                map.put(ch, strs[i]);
            }
        }
        return true;
    }
}