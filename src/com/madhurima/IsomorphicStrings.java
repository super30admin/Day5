/*
    Time Complexity = O(logN)
    Space Complexity = O(1) as size of hashmap/hashset is constant (26 small case + 26 upper case)
    Did this code successfully run on Leetcode : yes
 */


package com.madhurima;

import java.util.HashMap;
import java.util.HashSet;

//By using two separate hashmap

public class IsomorphicStrings {
}

class SolutionA1{
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(smap.containsKey(s.charAt(i))){
                if(smap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                smap.put(s.charAt(i), t.charAt(i));
            }

            if(tmap.containsKey(t.charAt(i))){
                if(tmap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else{
                tmap.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "paperuy";
        String s2 = "titlexu";

        SolutionA1 s = new SolutionA1();
        System.out.println(s.isIsomorphic(s1, s2));

    }
}

//using one HashMap and one Hashset
class SolutionA2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(smap.containsKey(s.charAt(i))){
                if(smap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(tset.contains(t.charAt(i))){
                    return false;
                }else{
                    smap.put(s.charAt(i), t.charAt(i));
                    tset.add(t.charAt(i));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "paperuy";
        String s2 = "titlexu";

        SolutionA2 s = new SolutionA2();
        System.out.println(s.isIsomorphic(s1, s2));

    }
}


//using two char arrays
class SolutionA3 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sArray = new char[100];
        char[] tArray = new char[100];

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sArray[sChar - ' '] != 0){
                if(sArray[sChar - ' '] != tChar){
                    return false;
                }
            }else{
                sArray[sChar - ' '] = tChar;
            }

            if(tArray[tChar - ' '] != 0){
                if(tArray[tChar - ' '] != sChar){
                    return false;
                }
            }else{
                tArray[tChar - ' '] = sChar;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s1 = "paperuy";
        String s2 = "titlexu";

        SolutionA3 s = new SolutionA3();
        System.out.println(s.isIsomorphic(s1, s2));

    }

}

