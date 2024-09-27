//Time Complexity : o(n)
//Space Complexity : o(m)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
       if(s == null || t == null){
            return false;
        }
        if(s.length() == 0 || t.length() == 0){
            return true;
        }
        
        Map<Character,Character> corr = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i ++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(corr.containsKey(sc)){
                if(corr.get(sc) != tc){
                    return false;
                }
            }
            else{
                if(corr.containsValue(tc)){
                    return false;   
                }
                else{
                    corr.put(sc,tc);
                }
            }
        }
        return true;
    }
}