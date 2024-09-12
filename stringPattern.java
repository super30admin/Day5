/**
Time complexity : O(n) n= no of strings 
Space complexity : O(1)
Did it run on Leetcode : Yes 

 */

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null || str==null || str.length()<1 || pattern.length()<1){
            return false;
        }
        String[] strs = str.split(" ");
        if(pattern.length()!= strs.length){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverse = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            
            if(map.containsKey(a)){
                if(!map.get(a).equals(strs[i])){
                    return false;
                }
            }
            else{
                map.put(a, strs[i]);
            }
        }
        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            String aa = strs[i];
            
            if(reverse.containsKey(aa)){
                if(reverse.get(aa)!=(a)){
                    return false;
                }
            }
            else{
                reverse.put(aa, a);
            }
        }
        return true;
    }
}