/*
let N = number of words, k = avg length of word
    Time Complexity = O(Nk) {iterating through String[] having N words * calculating hash for each word having avg length of k}
    Space Complexity = O(1) as number of characters can be max 26 (if all small letters) and 52 if uppercase also allowed
    Did this code successfully run on Leetcode : yes
 */



package com.madhurima;


import java.util.HashMap;
import java.util.HashSet;

public class PatternString {
}

//using two hashmaps
class SolutionC1 {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        char[] letters = pattern.toCharArray();

        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();

        for(int i = 0; i < letters.length; i++){
            if(pmap.containsKey(letters[i])){
                if(!pmap.get(letters[i]).equals(words[i])){
                    return false;
                }
            }else{
                pmap.put(letters[i], words[i]);
            }

            if(smap.containsKey(words[i])){
                if(smap.get(words[i]) != letters[i]){
                    return false;
                }
            }else{
                smap.put(words[i], letters[i]);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        SolutionC1 s = new SolutionC1();
        String pattern = "abba";
        String str = "dog cat cat fish";
        System.out.println(s.wordPattern(pattern,str));
    }
}


//using one hashmap and one hashset
class SolutionC2 {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null || pattern.length() == 0){
            return false;
        }

        char[] letters = pattern.toCharArray();
        String[] words = s.split(" ");

        if(letters.length != words.length){
            return false;
        }

        HashMap<Character,String> pmap = new HashMap<>();
        HashSet<String> mapped = new HashSet<>();

        for(int i = 0; i < letters.length; i++){
            if(pmap.containsKey(letters[i])){
                if(!pmap.get(letters[i]).equals(words[i])){
                    return false;
                }
            }else{
                if(mapped.contains(words[i])){
                    return false;
                }else{
                    pmap.put(letters[i], words[i]);
                    mapped.add(words[i]);
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        SolutionC2 s = new SolutionC2();
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(s.wordPattern(pattern,str));
    }
}