// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c) && seen.contains(strArray[i])){
                return false;
            }if(map.containsKey(c) && !map.get(c).equals(strArray[i])){
                return false;
            }
            if(!map.containsKey(c)){
                map.put(c, strArray[i]);
                seen.add(strArray[i]);
            }
        }
        return true;
    }
}
