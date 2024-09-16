//TC-O(n) string array size
//SC- O(n)
// Leetcode- Successfully run

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> sMap= new HashMap<>();
        HashMap<Character, Character> tMap= new HashMap<>();
        
        int len=s.length();
        
        int i=0;
        
        while(i<len){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
            i++;
           
            
        }
        
        return true;
        
        
    }
}