package com.hashing1;

import java.util.HashMap;


// Time Complexity: O(n)
//Space Complexity: O(n)


public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(words.length != pattern.length()) return false;


        HashMap<Character, String> map = new HashMap();


        for(int i = 0; i< words.length; i++){
            char currentChar = pattern.charAt(i);

            if(map.containsKey(currentChar)){

                if(!map.get(currentChar).equals(words[i])){
                    return false;
                }


            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
            }

            map.put(currentChar, words[i]);
        }


        return true;

    }


    public static void main(String[] args) {
        WordPattern sol = new WordPattern ();

        System.out.println (sol.wordPattern ("abba","dog cat cat dog"));
    }



}
