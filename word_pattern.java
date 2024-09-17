// TC: O(N) where N represents the number of words in String or  characters in pattern
// SC: O(M) where M represents the number of unique characters in String.

// We will split the String to form a String array so that we can easily map character with String.
// Consider 2 HashMap where we are storing each character of pattern with first string of String, if the character of pattern already exists, we check 
// if its corresponding string is also same as existing character value. if not we return false;
// In second map we store the corresponding string with character, since we are checking for one on one mapping, we are checking both sides,  
//  we check if the string is mapped to expected character, if not we return false.


import java.util.*;

public class word_pattern {
	
	public boolean WordPattern(String pattern, String str) {
		
		String[] strArr = str.split(" ");
		if(strArr.length!=pattern.length())
			return false;
		HashMap<Character, String> pMap = new HashMap();
		HashMap<String, Character> sMap = new HashMap();
		
		
		for(int i=0;i<pattern.length();i++) {
			
			if(!pMap.containsKey(pattern.charAt(i))) {
				pMap.put(pattern.charAt(i), strArr[i]);
			}
			else
				if(!pMap.get(pattern.charAt(i)).contentEquals(strArr[i]))
					return false;
			
			if(!sMap.containsKey(strArr[i]))
					sMap.put(strArr[i], pattern.charAt(i));
			else
				if(!sMap.get(strArr[i]).equals(pattern.charAt(i)))
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		word_pattern wp = new word_pattern();
		System.out.println(wp.WordPattern("abbs", "dog cat cat dog"));
	}

}
