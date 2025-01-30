// Time Complexity :o(n)
// Space Complexity :o(1) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        for(int i=0;i<sl;i++){
         char sChar=s.charAt(i);
         char tChar=t.charAt(i);
         if(!sMap.containsKey(sChar)){
            sMap.put(sChar,tChar);
         }else{
            if(sMap.get(sChar)!=tChar) return false;
         }

        if(!tMap.containsKey(tChar))
        {
            tMap.put(tChar,sChar);
        }else{
            if(tMap.get(tChar)!=sChar) return false;
        }
    }
    return true; 
    }
}

