package com.hmoework;

import java.util.HashMap;

public class WordPattern {

	public boolean wordPattern(String pattern, String s) {
		String[] strings = s.split(" ");

		HashMap<Character, String> map = new HashMap();

		if (strings.length != pattern.length()) {
			return false;
		}
		String s1 = "";
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (map.get(pattern.charAt(i)).equals(strings[i])) {
					s1 = s1 + pattern.charAt(i);
				} else {
					return false;
				}
			} else {
				String value = strings[i];
				if (map.containsValue(value)) {
					return false;
				} else {
					map.put(pattern.charAt(i), strings[i]);
					s1 = s1 + pattern.charAt(i);
				}
			}
		}
		if (s1.equals(pattern)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		WordPattern w = new WordPattern();
		System.out.println(w.wordPattern("abba", "dog cat cat dog"));
	}
}
