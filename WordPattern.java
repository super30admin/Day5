// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : 

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {		// Main function
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");			// split the sentence into the array to words
        int NoWords = words.length;					// find the number of words 

        if(pattern.length() != NoWords){			// if the number of words in the array in the not equal the letters in the pattern, return false
            return false;
        }

        HashMap<Character, String> mapStr1 = new HashMap<Character, String>();// HashMap declaration

        for ( int i = 0; i<pattern.length(); i++) {				// initialize for loop to the length of pattern
            char p = pattern.charAt(i);							// get the character
            String word = words[i];								// get the first word


            if(mapStr1.containsKey(p)){							// check if the hashmap already has the key
                String storedval = mapStr1.get(p);				// get the value corresponding to the key
                if(storedval != word){							// if the value in the hashmap is not equal to the word, return false
                    return false;
                }
            }
            else{
                mapStr1.put(p, word);							// if the key is not found, add it into the HashMap
            }
        }
        return true;											// if everything matches, return true 
    }
}
