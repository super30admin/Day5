import java.util.HashMap;

public class Word_Pattern {
	 public boolean wordPattern(String pattern, String str) {
		 //Approach: 1. Am considering hashmap, wherein character from pattern will be key and corresponding value will be the string from str. 
		 //2. Here am splitting the string with the string split regex operation and storing in strArray for iteration.
		 //3. Again am creating correspondence between character in pattern and words of string, if any of the condition fails, returning false.
	        HashMap<Character, String> map = new HashMap<>();
	        String[] strArray = str.split(" ", -2);
	      
	        if(pattern.length() != strArray.length)
	            return false;
	        for(int loop=0;loop<pattern.length();loop++)
	        {
	        
	            if(map.containsKey(pattern.charAt(loop)))
	            {
	                if(!map.get(pattern.charAt(loop)).equalsIgnoreCase(strArray[loop]) )
	                    return false;
	            }else
	            {
	                if(map.containsValue(strArray[loop]))
	                    return false;
	                else
	                    map.put(pattern.charAt(loop), strArray[loop]);
	            }
	        }
	        return true;
	    }
}
//Time Complexity : O(n),n is the no of characters in pattern.
//Space Complexity : O(n) where n is the number of characters in pattern.
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No