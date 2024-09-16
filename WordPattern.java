// Time Complexity : O(3n) = O(n) where n is the length of String pattern
// Space Complexity : O(n), n is the length of String pattern
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(words[i])){
                    //Everything's good!
                }
                else{
                    return false;
                }
            }
            else{
                if(set.contains(words[i])){
                    return false;
                }
                else{
                    map.put(pattern.charAt(i), words[i]);
                    set.add(words[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wp.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wp.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wp.wordPattern("abba", "dog dog dog dog"));
    }
}