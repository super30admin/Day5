/*
 * #290. Word Pattern
 * 
 * Time Complexity: O (N) -> N represents the number of words in the str or the number of characters in the pattern to traverse in for loop.
 * 
 * Space Complexity: O (N) -> To store N number of characters in pattern or words in str
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.hashing1;

import java.util.HashMap;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String str) {
		
		// Create a map
        HashMap map_index = new HashMap();
        // array of words in a string separated by commas
        String[] words = str.split(" ");

        // Input validation check
        // If words and pattern length doesn't match, return false
        if (words.length != pattern.length())
            return false;

        // Traverse through the words in string or pattern (letters)
        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i); // letter
            String w = words[i]; // word in a string

            // If letter is not already present in a map
            if (!map_index.containsKey(c))
                map_index.put(c, i); // put the letter as key and respective index starting from 0 as value

            // If word is not already present in a map
            if (!map_index.containsKey(w))
                map_index.put(w, i); // put the word as key and respective index starting from 0 as value

            if (map_index.get(c) != map_index.get(w)) // If index of both letter and word is not same
                return false; // Meaning string doesn't follow the given pattern, return false, else continue
        }

        return true; // After traversing all the letters in pattern and words in string, if no mismatch in index is found, return true
        			// Meaning, string follows the given pattern
    }
	
}
