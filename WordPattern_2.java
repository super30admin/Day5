//Let n be the no of words in s, k be the no of letters in each word, m be the no of letters in pattern.
//Time Complexity : O(nk) + O(mk)
//Space Complexity : O(nk)
//Code run successfully on LeetCode.


import java.util.HashMap;
import java.util.HashSet;

public class WordPattern_2 {
	
	 public boolean wordPattern(String pattern, String s) {
		 
		 String[] str = s.split(" ");
		 
		 if(pattern.length() != str.length)
			 return false;
		 
		 HashMap<Character, String> pmap = new HashMap<>();
		 HashSet<String> set = new HashSet<>();
		 
		 char schar;
		 String str1;
		 
		 for(int i =0; i < pattern.length(); i++) {
			 
			 schar = pattern.charAt(i);
			 str1 = str[i];
			 
			 if(pmap.containsKey(schar)) {
				 if(!str1.equals(pmap.get(schar)))
					 return false;
			 }
			 else {
				 pmap.put(schar, str1);
				 
				 if(set.contains(str1))
					 return false;
				 
				 set.add(str1);
			 }
			 
		 } 
	     return true; 
	    }

}
