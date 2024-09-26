// Time Complexity :0(n) no of characters in the s or t
// Space Complexity : 0(mn) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            } else{
                if(tSet.contains(tChar)) return false;
                    else{
                sMap.put(sChar,tChar);
                tSet.add(tChar);
                    }
            }

        }
        
          return true;
    }
}