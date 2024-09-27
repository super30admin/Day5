// Time Complexity : O(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false; //Unequal length
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);            
            
            //S to T mapping
            if(sMap.containsKey(sChar)){     //If sMap contains mapping of sChar key, check if value of sChar key is correctly mapped to tChar
                if(sMap.get(sChar) != tChar) return false;
            } else{                          //If sMap doesn't contain mapping of sChar key, then create one
                sMap.put(sChar, tChar);
            }
            
            //T to S mapping
            if(tMap.containsKey(tChar)){     //If tMap doesn't contain mapping of tChar key, then create one
            //     tMap.put(tChar, sChar);
                if(tMap.get(tChar) != sChar) return false;
            } else{                         //If tMap doesn't contain mapping of tChar key, then create one
                tMap.put(tChar, sChar);
            }
            
        }
        
        return true;
    }
}