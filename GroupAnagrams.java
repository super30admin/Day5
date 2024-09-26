package com.exmaple.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Time Complexity : O(N K Log K) for all Sorting and O (N K ) for prime product approach 
//Space Complexity : O(1) for all operations
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*
HashMap works on principle of Hashing.We 
*/

public class GroupAnagrams {

	private static boolean isPrimeProduct = true;

	private long primeProducts(String str) {
		int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101 };
		long result = 1L;
		int size = str.length();

		for (int i = 0; i < size; i++) {
			char ch = str.charAt(i);
			result *= primes[ch - 'a'];
		}
		return result;
	}

	public List<List<String>> groupAnagrams(String strs[]) {
		if (strs == null || strs.length == 0)
			return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		Map<Long, List<String>> map1 = new HashMap<>();

		if (!isPrimeProduct) {
			for (String str : strs) {
				char ch[] = str.toCharArray();
				Arrays.sort(ch);
				String s = new StringBuffer().append(ch).toString();
				if (!map.containsKey(s)) {
					map.put(s, new ArrayList<String>());
				}
				map.get(s).add(str);
			}
			return new ArrayList<>(map.values());

		}
		for (String str : strs) {
			long pp = primeProducts(str);
			System.out.println(pp);
			if (!map1.containsKey(pp)) {
				map1.put(pp, new ArrayList<String>());
			}
			map1.get(pp).add(str);
		}

		return new ArrayList<>(map1.values());
	}

	public static void main(String args[]) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagrams anagrams = new GroupAnagrams();
		System.out.println(anagrams.groupAnagrams(strs));
	}
}
