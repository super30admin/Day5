import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(n) , n = length of the strings
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes

// In this problem I use a map to store the one to one mapping between characters. 
// I use a HashSet to keep track of backward mapping. If the character in the second 
// string is already mapped to any other character before, I will return false.,

public class Problem_2 {
	
	 public boolean isIsomorphic(String s, String t) {
	        
		    HashMap<Character, Character> patternMap = new HashMap<>();
	        HashSet<Character> strSet = new HashSet<>();
	        
	        for(int i = 0; i < s.length(); i++){
	            Character c = s.charAt(i);
	            if(patternMap.containsKey(c) && !patternMap.get(c).equals(t.charAt(i))){
	                return false;
	            }
	            if(!patternMap.containsKey(c) && strSet.contains(t.charAt(i))){
	                 return false;
	            }
	            if(!patternMap.containsKey(c)){
	                 patternMap.put(c, t.charAt(i));
	                 strSet.add(t.charAt(i));
	            }
	        
	        }
	        return true;
	    
 }
}
