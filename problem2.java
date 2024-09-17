import java.util.*
;
public class problem2 {
// Time Complexity : O(n)
// Space Complexity : Constant
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public boolean isIsomorphic(String s, String t) {
        
    HashMap<Character,Character> sMap = new HashMap<>();
    HashMap<Character,Character> tMap = new HashMap<>();
    
    for(int i=0;i<s.length();i++){
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);
        
        if(!sMap.containsKey(sChar)){
            sMap.put(sChar,tChar);
        }else{
            if(sMap.get(sChar)!=tChar){
                return false;
            }
        }
     }
    
     for(int i=0;i<t.length();i++){
        char tChar = t.charAt(i);
        char sChar = s.charAt(i);
         
        if(!tMap.containsKey(tChar)){
            tMap.put(tChar,sChar);
        }else{
            if(tMap.get(tChar)!=sChar){
                return false;
            }
        }
     }
           return true;
}
}
