package HashFunction;

import java.util.HashMap;

/*
-------------------------------------------------------------------------------------------------------
Time complexity : o(n) - 
space complexity: o(1) --> o(n1 the values in map takes up maximum space of 26. as only 26 lower characters exists to for any string
Did this code run successfully in leetcode : yes
problems faces : no
*/
public class WordPattern {

    public static void main(String[] args) {

        System.out.println("wordPattern : " + wordPattern("abba", "dog cat cat dog"));

    }

    public static boolean wordPattern(String pattern, String s) {

        String[] wordsList = s.split(" ");

        if (pattern.length() != wordsList.length)
            return false;

        HashMap<Character, String> pMap = new HashMap<Character, String>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!pMap.containsKey(pattern.charAt(i))) {
                pMap.put(pattern.charAt(i), wordsList[i]);
            }

            if (!pMap.get(pattern.charAt(i)).equals(wordsList[i])) {
                return false;
            }

        }
        
        HashMap<String,Character> wMap = new HashMap<String, Character>();
        
        for (int i = 0; i < wordsList.length; i++) {
            if (!wMap.containsKey( wordsList[i])) {
                wMap.put(wordsList[i],pattern.charAt(i));
            }

            if (!wMap.get(wordsList[i]).equals(pattern.charAt(i))) {
                return false;
            }

        }
        return true;
    }
}
