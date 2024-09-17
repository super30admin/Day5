// Time Complexity : O(n)
// Space Complexity : (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(string== null || pattern==null) 
            return false
            
        String[] arr = str.split(" ");
        if(arr.length != pattern.length())
            return false;
        
        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c) && !map.get(c).equals(arr[i])){
                return false;
            }else if (!map.containsKey(c)){
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(c, arr[i]);
            }
        }
        return true;
    }
}