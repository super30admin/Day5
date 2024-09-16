// Time Complexity : O(n)
// Space Complexity : O(n) - since string s will be split to a string array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class PatternString {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        String[] sArr = s.split("\\s+");
        if(pattern.length() != sArr.length) return false;
        
        for(int i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            
            if(!pMap.containsKey(p)){
                pMap.put(p,sArr[i]);
            }
            else{
                if(!sArr[i].equals(pMap.get(p))){
                    return false;
                }
            }
            
            if(!sMap.containsKey(sArr[i])){
                sMap.put(sArr[i], p);
            }
            else{
                if(sMap.get(sArr[i]) != p){
                    return false;
                }
            }
        }
        return true;
    }
}
