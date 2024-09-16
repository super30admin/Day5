// Time Complexity : O(n)
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] st = str.split(" ");
        int pSize=pattern.length();
        int sSize=st.length;
        if(pSize != sSize){
            return false;
        }
        
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i=0;i<pSize;i++){
            
            char pChar = pattern.charAt(i);
            
            if(!pMap.containsKey(pChar)){
                pMap.put(pChar, st[i]);
            }else{
                if(!pMap.get(pChar).equals(st[i])){
                    return false;
                }
            }
            
            if(!sMap.containsKey(st[i])){
                sMap.put(st[i], pChar);
            }else{
                if(!sMap.get(st[i]).equals(pChar)){
                    return false;
                }
            }
        }
        
        return true;
    }
}