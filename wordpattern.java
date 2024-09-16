// Time Complexity : O(n)
// Space Complexity : 0(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> pMap = new HashMap<>();
        String[] sArray = s.split(" ");
        if(pattern.length()!= sArray.length)
            return false;
        Set<String> set = new HashSet<>();
        for(int i =0;i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            String str = sArray[i];
            if(pMap.containsKey(pChar)){
                if(!(pMap.get(pChar)).equals(str))
                    return false;
            }
            else{
                if(set.contains(str))
                    return false;
                pMap.put(pChar,str);
                set.add(str);
            }
        }
        return true;
    }
}
