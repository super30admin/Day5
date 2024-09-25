//Isomorphic String
// Time Complexity : O(n), n is string length 
// Space Complexity : O(1)-constant space becuse there will be 26 characters only
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Create Two maps for keeping mapping from both the sides , so that one character can be mapped to one word and vice versa. Mapping need to be checked from both sides Further more optimal solution is, if instead of map char array of fixed size is used.
*/


class Solution13 {
    public boolean isIsomorphic(String s, String t) {
        
        if(s==null || t==null || s.length()==0 || t.length()==0){
            return true;
        }
        
        //Two maps because relationships has to be checked from both the side
        //TC-> O(N),SC->(O(1))-> as it is going to be constant which is 26 character
        //Map<Character,Character> mapS = new HashMap<>();
        //Map<Character,Character> mapT = new HashMap<>();
        
        //as characters are fixed, the we can create a char array of 26 or 100, depends on interviewer, as under the hood hashmap is array
        char[] mapS = new char[100];//Here 100 because characters can start from empty space whose ascii is 32
        char[] mapT = new char[100];
        
        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            /* HashMap Code
            if(mapS.containsKey(chS) && mapS.get(chS)!=chT){
                return false;
            }
            
            if(mapT.containsKey(chT) && mapT.get(chT)!=chS){
               return false;
            }
            
            if(!mapS.containsKey(chS) && !mapT.containsKey(chT)){
                mapS.put(chS,chT);
                mapT.put(chT,chS);
            }*/
            
            if(mapS[chS-' ']!=0){
                if(mapS[chS-' ']!=chT){
                    return false;
                }   
            }else{
                mapS[chS-' '] = chT;
            }
            
             if(mapT[chT-' ']!=0){
                if(mapT[chT-' ']!=chS){
                    return false;
                }   
            }else{
                mapT[chT-' '] = chS;
            }
            
        }
        
        return true;
    }
}