// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach
class Solution {
	public boolean wordPattern(String pattern, String s) {
		 String[] splitted = s.split(" ");
		 
		 if (splitted.length != pattern.length()) return false;
		 
		 HashMap<Character, String> map = new HashMap<>();
		 
		 for(int i = 0; i < pattern.length(); i++) {
			  if (map.containsValue(splitted[i]) && !map.containsKey(pattern.charAt(i))) {
					return false;
			  }
			  else if(!map.containsKey(pattern.charAt(i))) {
					map.put(pattern.charAt(i), splitted[i]);  
			  } else if(!map.get(pattern.charAt(i)).equals(splitted[i])) {
					return false;
			  }
		 }
		 
		 return true;
	}
}