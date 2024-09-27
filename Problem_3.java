import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(n) , n = length of string pattern
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// The approach is very similar to problem 2.

public class Problem_3 {
	 public boolean wordPattern(String pattern, String str) {
	        
		 String[] strList = str.split(" ");
		 if(pattern.length() != strList.length) return false;
		 HashMap<Character, String> patternMap = new HashMap<>();
	     HashSet<String> strSet = new HashSet<>();
	        
	        for(int i = 0; i < pattern.length(); i++){
	            Character c = pattern.charAt(i);
	            if(patternMap.containsKey(c) && !patternMap.get(c).equals(strList[i])){
	                return false;
	            }
	            if(!patternMap.containsKey(c) && strSet.contains(strList[i])){
	                 return false;
	            }
	            if(!patternMap.containsKey(c)){
	                 patternMap.put(c, strList[i]);
	                 strSet.add(strList[i]);
	            }
	        
	        }
	        return true;
	    
    }
}
