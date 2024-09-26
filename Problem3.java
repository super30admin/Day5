import java.util.Map;

// Time Complexity : O(n)
// Space Complexity : O(n) - Using a Map
// Did this code successfully run on Leetcode : I am not sure about the problem no on LeetCode

// Your code here along with comments explaining your approach

// Traversing the pattern and mapping the string, if mapping doesn't match, return false
class Solution {
    public boolean fullMatch(String pattern, String str) {
        
        if(pattern.length() != str.length()){
            return false;
        }
        
        if((pattern == null && str != null) || (pattern != null && str == null)){
            return false;
        }
        
        if(pattern == null && str == null){
            return true;
        }

		String[] splitArray = str.split(" ");

		int start = 0;
		
		int end = pattern.length();

		Map<Character, String> map = new HashMap<>();

		while(start < end){

			char c = pattern.charAt(start);

			if(map.containsKey(c) && map.get(c).notEquals(splitArray[start])){
				return false;
			}
			
			map.put(c, splitArray[start]);

			start++;

		}

		return true;
}
}