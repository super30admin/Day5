// Time Complexity : O(n)
// Space Complexity : O(n) - Using a Map
// Did this code successfully run on Leetcode : 10ms

// Your code here along with comments explaining your approach


class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        if(s == null && t != null || s != null && t == null){
            return false;
        }
        
        if(s == null && t == null){
            return true;
        }


        //checking here if the key(character from string1 and character from string2 doesn't exist)
		
		Map<Character, Character> map = new HashMap<>();
		
		for(int i = 0 ; i<s.length() ; i++)
		{
			if(!map.containsKey(s.charAt(i)) && !map.values().contains(t.charAt(i)))
			{
				map.put(s.charAt(i), t.charAt(i));
				
			}
            if(!map.containsKey(s.charAt(i)) && map.values().contains(t.charAt(i)))
			{
				return false;
				
			}
			else if(map.get(s.charAt(i)) == t.charAt(i))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		
		return true;
     
    }
}