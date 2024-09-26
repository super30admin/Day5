package Hashing1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagramsWithPrimeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> anagrams = new ArrayList<>();
		anagrams = findAnagrams(strs);
		
		System.out.println(anagrams);
	}
	
	public static List<List<String>> findAnagrams(String[] strs){
		
		if(strs == null || strs.length == 0) return new ArrayList<>();
		HashMap<Long, List<String>> map = new HashMap<>();
		
		for(String s : strs) {
			char[] charArray = s.toCharArray();
			long primeProduct = primeProduct(s);
			if(!map.containsKey(primeProduct)) {
				map.put(primeProduct, new ArrayList<>());
			}
			map.get(primeProduct).add(s);
		}

		return new ArrayList<>(map.values());
	}
	
	
	public static long primeProduct(String s) {
		
		long result =1;
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,103};
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			result *= primes[c-'a'];
		}
		
		return result;
	}

}
