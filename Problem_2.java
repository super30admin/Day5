// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
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
