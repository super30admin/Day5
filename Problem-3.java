// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Spliting the string


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> map1 = new HashMap<>();
        String []str = s.split("\\s+");
        if(str.length != pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++) {
            if(map.containsKey(Character.toString(pattern.charAt(i))) && map1.containsKey(str[i])) {
                String temp = Character.toString(pattern.charAt(i));
                String temp1 = str[i];
                
                String val = map.get(temp);
                String val1 =  map1.get(temp1);
                
                if(temp.compareTo(val1) != 0) {
                    return false;
                }
                if(temp1.compareTo(val) != 0) {
                    return false;
                }
                
            }
            else if (!map.containsKey(Character.toString(pattern.charAt(i))) && !map1.containsKey(str[i])){
                map.put(Character.toString(pattern.charAt(i)),str[i]);
                map1.put(str[i],Character.toString(pattern.charAt(i)));
            }
            else {
                return false;
            }
        }
        return true;
    }
}