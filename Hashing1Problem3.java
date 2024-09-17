// Time Complexity :O(n) where n is length of strs
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : None

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
  			return false;
        }

        Map<Character, String> dict = new HashMap();
        Set<String> set = new HashSet();

        for (int i = 0; i < words.length; ++i) {
        	char c = pattern.charAt(i);
        	if (!dict.containsKey(c)) {
        	    if (!set.add(words[i])) {
        	        return false;
        	    }
        		dict.put(c, words[i]);
        	} else if (!dict.get(c).equals(words[i])) {
        		return false;
        	}
        }

        return true;
    }
} 
