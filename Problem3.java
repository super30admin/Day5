
// 
public class WordPattern {


	private static boolean wordPatternMatches(String pattern, String s) {
		// TODO Auto-generated method stub

	       HashMap map_index = new HashMap();
	       String[] words = s.split(" ");

	        if (words.length != pattern.length())
	            return false;

	        for (Integer i = 0; i < words.length; i++) {
	            char c = pattern.charAt(i);
	            String w = words[i];

	            if (!map_index.containsKey(c))
	                map_index.put(c, i);

	            if (!map_index.containsKey(w))
	                map_index.put(w, i);

	            if (map_index.get(c) != map_index.get(w))
	                return false;
	        }

	        return true;
	    }
	}

    // Complexity Analysis

    /*
    Time complexity : O(N) where N represents the number of words in the s or the number of characters in the pattern.

    Space complexity : O(M) where M is the number of unique characters in pattern and words in s.
    */