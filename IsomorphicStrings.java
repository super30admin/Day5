package com.hashing1;

// Time Complexity: O(n)
//Space Complexity: O(n)


import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t)  {

        if(s.length() != t.length()) return true;


        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(map.containsKey(sc)){
                if(map.get(sc) != tc) return false;
            } else{
                if(map.containsValue(tc)) return false;
                map.put(sc,tc);
            }
        }

        return true;

    }


    public static void main(String[] args) {
        IsomorphicStrings sol = new IsomorphicStrings ();

        System.out.println (sol.isIsomorphic ( "egg", "add"));

    }


}
