// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

//find if string follows a pattern or not
// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String arr[] = s.split(" ");
        
        if(arr.length != pattern.length()) return false;
        
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = new String(arr[i]);
            if(map.containsKey(c)) {
                if(!map.get(c).equals(str)){
                    return false;
                }
            } else if(set.contains(str)){
                return false;
            } else {
                map.put(c, str);
                set.add(str);
            }
        }
        
        return true;
    }
}
