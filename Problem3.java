// Time Complexity : O(1)
// Space Complexity :O(NlogN)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> smap = new HashMap<Character, String>();
        HashMap<String, Character> tmap = new HashMap<String, Character>();
        
        String[] arr = s.split(" ");
        
        if(pattern.length() != arr.length) return false;
        for (int i = 0; i < pattern.length(); i++ ){
            char ch = pattern.charAt(i);
            String cur = arr[i];
            if(!smap.containsKey(ch)){
                smap.put(ch,cur);
            }
            else{
                if(!smap.get(ch).equals(cur)) return false;
            }
            if(!tmap.containsKey(cur)){
                tmap.put(cur,ch);
            }
            else{
                if(tmap.get(cur) != ch) return false;
            }
        }
        return true;
    }
}
