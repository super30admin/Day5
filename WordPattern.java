//TC: O(N)
//SC: O(1)

import java.util.*;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        
        if(words.length != pattern.length()) return false;
        
        HashMap<String, Character> wordMap = new HashMap<>();
        HashMap<Character, String> patternMap = new HashMap<>();
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            char pChar = pattern.charAt(i);
            
            //If map for patternMap doesn't contain current character, insert it map with word
            if(!patternMap.containsKey(pChar)){
                patternMap.put(pChar,word);
            } else {
                if(!patternMap.get(pChar).equals(word)) return false;
            }

            //If map for wordMap doesn't contain current word, insert it map with pattern's character
            if(!wordMap.containsKey(word)){
                wordMap.put(word,pChar);
            } else {
                if(wordMap.get(word) != pChar) return false;
            }
        }
           return true; 
    }
    public static void main(String args[]){
        WordPattern wp = new WordPattern();

        System.out.println("Are abba and 'dog cat cat dog' Isomorphic: "+wp.wordPattern("abba","dog cat cat dog"));
        System.out.println("Are aaaa and 'dog cat cat dog' Isomorphic: "+wp.wordPattern("aaaa","dog cat cat dog"));
    }
}

/**
OUTPUT:
Are abba and 'dog cat cat dog' Isomorphic: true
Are aaaa and 'dog cat cat dog' Isomorphic: false
 */