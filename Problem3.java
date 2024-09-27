// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");


        if(arr.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                String value = map.get(ch);
                if(!value.equals(arr[i])){
                    return false;
                }
            }else if (map.containsValue(arr[i])){
                return false;
            }
            map.put(ch, arr[i]);
        }

        return true;
    }
}