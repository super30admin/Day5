// Time Complexity :isIsomorphic: O(2n)=O(n) , n is  number of characters in the string
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.HashMap;
import java.util.HashSet;

public class Problem1 {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;


        HashMap<Character, Character> sMap= new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char sChar= s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar) return false;
            } else{
                if(set.contains(tChar)) return false;
                set.add(tChar);
                sMap.put(sChar,tChar);
            }
        }
        return true;
    }


    public static void main(String args[]) {
        Problem1 problem1 = new Problem1();
        String s= "bba";
        String t= "aad";
        System.out.println("isomorphic "+problem1.isIsomorphic(s,t));

    }
}
