// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(arr[i])) return false;
            }
            else if(!map.containsValue(arr[i])){
                map.put(ch,arr[i]);
            }else return false;
        }
        return true;
    }
}