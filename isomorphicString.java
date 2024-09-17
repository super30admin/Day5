    /*  Explanation
    Time Complexity for operators : n 
    Extra Space Complexity for operators : o(n) .. two hashmap extra space
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
    Initillay delcare two hashmaps. And run the one for loop.
    and map character from each of the string one by one and check whether mapping is correct or not.
    if it is correct then only return true else return false
    */

import java.util.*;
    class isomorphic {
        public boolean isIsomorphic(String s, String t) {
            
            if(s.length()!=t.length())
                return false;
            HashMap<Character,Character> hmS = new HashMap<>();
            HashMap<Character,Character> hmT = new HashMap<>();
            
            for(int i=0;i<s.length();i++){
                char chs = s.charAt(i);
                
                if(hmS.containsKey(chs)){
                    char c = hmS.get(chs);
                    if(c!=t.charAt(i))
                        return false;
                }else{
                    hmS.put(chs,t.charAt(i));
                }
                
                
                char cht = t.charAt(i);
                
                if(hmT.containsKey(cht)){
                    char c = hmT.get(cht);
                    if(c!=s.charAt(i))
                        return false;
                }else{
                    hmT.put(cht,s.charAt(i));
                }
            }
    
            
            return true;
        }

        public static void main(String args[]){
            isomorphic gr = new isomorphic();
            System.out.println(gr.isIsomorphic("foo","bar"));
        }
    }