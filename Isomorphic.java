package com.hmoework;

import java.util.HashMap;

public class Isomorphic {

	public boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map = new HashMap<>();
		if (s.length() != t.length()) {
			return false;
		} else {
			char[] firstString = s.toCharArray();
			char[] secondString = t.toCharArray();

			for (int i = 0; i < s.length(); i++) {
				if (map.containsKey(firstString[i])) {
					if (map.get(firstString[i]).equals(secondString[i])) {
						firstString[i] = map.get(firstString[i]);
					} else {
						return false;
					}

				} else {
					char value = secondString[i];
					if (map.containsValue(value)) {
						return false;
					} else {
						map.put(firstString[i], secondString[i]);
						firstString[i] = map.get(firstString[i]);
					}
				}
			}
			if (new String(firstString).equals(new String(secondString))) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Isomorphic c = new Isomorphic();
		System.out.println(c.isIsomorphic("paper", "title"));
	}
}
