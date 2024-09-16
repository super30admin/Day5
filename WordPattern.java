// Time Complexity : 0(n) where n is length of pattern
// Space Complexity : 0(1) because there is constant(26) space for map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s == null || pattern == null)
            return false;

        //initialize map for char to string mapping
        HashMap<Character, String> map = new HashMap<>();

        //split string by " "
        String[] arr = s.split(" ");

        //if lengths are not equal, then return false
        if(pattern.length() != arr.length)
            return false;

        //iterate through the pattern
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            //if map contains char, see if values match
            if(map.containsKey(c)){
                if(!arr[i].equals(map.get(c)))
                    return false;
            }
            //if map doesn't contain value, then see if same value already exist in map
            else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(c,arr[i]);
            }
        }

        return true;
    }
}