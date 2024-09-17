// Time Complexity : O(N) - N = length of string
// Space Complexity : O(M) - M = number of unique characters in string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

public class Problem2 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(!map1.containsKey(s1)){
                map1.put(s1,t1);
            }
            if(!map1.get(s1).equals(t1)) return false;

            if(!map2.containsKey(t1)){
                map2.put(t1,s1);
            }
            if(!map2.get(t1).equals(s1)) return false;    
            }  
        return true;
    }

    public static void main(String[] args){
        String s="malayalam";
        String t="nblbzblbu";

        System.out.println(Problem2.isIsomorphic(s,t));
    }
}