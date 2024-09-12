// Time Complexity : O(n): n is number of words or characters in string/pattern 
// Space Complexity : O(1):
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


// Your code here along with comments explaining your approach
/* Having 2 hashmaps, First map for mapping character to words, Second map for mapping Words to Characters*/


import java.util.*;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map1 = new HashMap<>();  //First map for mapping character to words
		HashMap<String, Character> map2 = new HashMap<>();	//Second map for mapping Words to Characters
		
		String[] words = str.split(" ");
		
		if(pattern.length() != words.length)
			return false;
		
		for(int i=0; i<pattern.length(); i++) {
			char c = pattern.charAt(i);
			String w = words[i];
			
			if(!map1.containsKey(c)) {			//if first map does not contains any character, and second map contains words, return false;
				if(map2.containsKey(w)) {
					return false;
				}
				else {
					map1.put(c, w);			// else update maps
					map2.put(w, c);
				}
			}
			else {
				if(!map1.get(c).equals(w))	// if first map character is not matching with word, return false	
					return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));
	}

}
