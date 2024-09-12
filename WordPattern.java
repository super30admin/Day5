class Solution {
    // Time Complexity : O(n), where n is length of the pattern
    // Space Complexity : O(n), where n is the length of s
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] arr = s.split(" ");
        int len = pattern.length();

        if(arr.length != len) return false;
        for(int i = 0; i < len; i++) {
            if(map.containsKey(pattern.charAt(i)) && !arr[i].equals(""+map.get(pattern.charAt(i))))
                return false;
            else if(set.contains(arr[i]) && !map.containsKey(pattern.charAt(i)))
                return false;
            else {
                map.put(pattern.charAt(i), arr[i]);
                set.add(arr[i]);
            }
        }
        return true;
    }
}