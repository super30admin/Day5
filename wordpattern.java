// Time Complexity : best case - O(N) 
// Space Complexity : O(N) - N size of HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str1 = s.split(" ");
        if(pattern.length() != str1.length) return false;
        HashMap<Character,String> map1 = new HashMap<>();
        for(int i = 0;i < pattern.length();i++){
            char c1 = pattern.charAt(i);
            String s2 = str1[i];
            if(map1.containsKey(c1)){
               if(!map1.get(c1).equals(s2)) return false;
            }
            else{
                if(!map1.containsValue(s2)){
                    map1.put(c1,s2);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}