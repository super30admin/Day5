// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() ==0) return false;
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length){
            return false;
        }
        for(int i = 0; i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = strArray[i];
            if(pMap.containsKey(c) && !pMap.get(c).equals(str)){
                return false;
            }
            else{
                pMap.put(c,str);
            }
            if(sMap.containsKey(str) && sMap.get(str)!=c){
                return false;
            }
            else{
                sMap.put(str,c);
            }
        }
        return true;
    }
}