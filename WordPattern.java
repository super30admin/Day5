/*
 * 
Time complexity O(n)
Space complexity O(n)

 * Pseudocode 
 * 
 * 1.) make 2 hash tables one for chars and one for words strings
 * 2.) store index of chars and words for mapping
 * 3.) iterate and if index different for indentical words then return false else true
 * 4.) use put as it returns old mapped value or null for new keys
 * 
 * */
public class WordPattern {
	public boolean wordPattern(String givenpattern, String str) {
		char[] chararray = givenpattern.toCharArray();
		String[] strs = str.split(" ");
		if (chararray.length != strs.length) return false;
		HashMap<Character, Integer> charmap = new HashMap<>();
		HashMap<String, Integer> wordmap = new HashMap<>();
		for (Integer i = 0; i < chararray.length; i++) {
			if (charmap.put(chararray[i], i) != wordmap.put(strs[i], i)) return false;
		}
		return true;
	}



}
