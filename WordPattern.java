package Hashing1;

import java.util.HashMap;

//Time Complexity : O(n) for searching using binary search
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Given a pattern and a string , find if the string follows the pattern or not.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//Example 1:
//Input: pattern = "abba", str = "dog cat cat dog"
//Output: true

//Your code here along with comments explaining your approach
// Using hashmap check if every char in pattern matches to every word in string s in order
// if it matches return true else false


public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String s = "dog cat cat dog";

		boolean res = wordPatternMatches(pattern,s);
		
		System.out.println(res);
	}

	private static boolean wordPatternMatches(String pattern, String s) {
		// TODO Auto-generated method stub
		
	       HashMap map_index = new HashMap();
	       String[] words = s.split(" ");

	        if (words.length != pattern.length())
	            return false;

	        for (Integer i = 0; i < words.length; i++) {
	            char c = pattern.charAt(i);
	            String w = words[i];

	            if (!map_index.containsKey(c))
	                map_index.put(c, i);

	            if (!map_index.containsKey(w))
	                map_index.put(w, i);

	            if (map_index.get(c) != map_index.get(w))
	                return false;
	        }

	        return true;
	    }
	}

