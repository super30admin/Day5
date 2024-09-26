package Hashing1;

//Time Complexity : O(nklogk) for finding anagrams
//Space Complexity : O(nk)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
// sort the words and put into hashmap if it doesn't exist, then when a new word is found and it's mapping found in hashmap then create 
// new list and insert else put in the hashmap key, then create list of lists formed.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> anagrams = new ArrayList<>();
		anagrams = findAnagrams(strs);
		
		System.out.println(anagrams);
	}
	
	public static List<List<String>> findAnagrams(String[] strs){
		
		if(strs == null || strs.length == 0) return new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			
			String sorted = String.valueOf(charArray);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(s);
		}

		return new ArrayList<>(map.values());
	}

}
