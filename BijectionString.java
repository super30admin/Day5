package com.Aug2020.Strings;

import java.util.HashMap;
import java.util.Map;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :
// not able to guess whether two maps would do the trick.

public class BijectionString {
	
	public static void main(String[] args) {
		String pattern = "abba";
		String val = "dog cat cat cat";
		System.out.println("flag is => " + wordPattern(pattern, val));
	}
	 public static boolean wordPattern(String pattern, String str) {
	        
	        if (str == null || str.length() == 0 ) {
	            return false;
	        }
	        String[] charArr = str.split(" ");
	        if (charArr.length != pattern.length()) {
	            return false;
	        }
	        Map<Character, String> pMap = new HashMap<Character, String>();
	        Map<String, Character> sMap = new HashMap<String, Character>();
	        
	        for (int i = 0; i < pattern.length(); i++) {
	            char ch = pattern.charAt(i);
	              if (!pMap.containsKey(ch)) {
	                  pMap.put(ch, charArr[i]);
	              }// else {
	                   if (!pMap.get(ch).equals(charArr[i])) {
	                        return false;
	                     }
	             // }
	           
	            
	            if (!sMap.containsKey(charArr[i])) {
	                sMap.put(charArr[i], ch);
	            }// else {
	                 if (!sMap.get(charArr[i]).equals(ch)) {
	                     return false;
	                 }
	           // }
	           
	            
	        }
	        return true;
	        
	        
	        
	        
	    }
}
