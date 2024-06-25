// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used a hashmap to maintain the pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arrOfStr = s.split(" ");
        if(pattern.length()!= arrOfStr.length) return false;
        for(int i =0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arrOfStr[i])) return false;
            }
            else{
                if(map.containsValue(arrOfStr[i])) return false;
                map.put(pattern.charAt(i), arrOfStr[i]);
            }
        }
        return true;

    }
}