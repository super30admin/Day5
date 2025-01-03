// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Same logic as isomorphic  but with words
package Hashing1;

import java.util.HashMap;


class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String [] stringArray = s.split(" ");
        if(stringArray.length!=pattern.length()){
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(patternMap.containsKey(pattern.charAt(i))){
                String val = patternMap.get(pattern.charAt(i));
                if(!val.equals(stringArray[i])){
                    return false;
                }
            } else {
                patternMap.put(pattern.charAt(i), stringArray[i]);
            }
            if(sMap.containsKey(stringArray[i])){
                Character val = sMap.get(stringArray[i]);
                if(val!=pattern.charAt(i)){
                    return false;
                }
            } else {
                sMap.put(stringArray[i], pattern.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        System.out.println(obj.wordPattern("abba", "cat dog dog cat"));
    }
}