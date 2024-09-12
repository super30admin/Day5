// time complexity is o(n) as we string length
// space complexity is nk + nk = 2nk = nk as two hashMap map is used
// this solution is passed on leetcode

import java.util.HashMap;

public class WordPatternBigN13 {
	public boolean wordPattern(String pattern, String str) {
		String[] splitted = str.split(" ");
		char [] check = pattern.toCharArray();
		// edge case:
		if (str.length() == 0 || str == null) {
			return false;
		}
		if (splitted.length!=check.length){
			return false;
		}
		HashMap<Character, String> hashPattern = new HashMap<>();
		HashMap<String, Character> hashString = new HashMap<>();
		for (int i = 0; i < splitted.length; i++) {
			char c = pattern.charAt(i);
			if (!hashPattern.containsKey(c)) {
				hashPattern.put(c, splitted[i]);
			}
			else {
				if (!hashPattern.get(c).equals(splitted[i])) {
					return false;
				}
			}
			if(!hashString.containsKey(splitted[i])) {
				hashString.put(splitted[i], c);
			}
			else {
				if(!hashString.get(splitted[i]).equals(c)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		WordPatternBigN13 word = new WordPatternBigN13();
		String pattern = "adda";
		String str = "dog dog dog dog";
		System.out.println(word.wordPattern(pattern, str));
	}

}
