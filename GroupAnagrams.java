// Time Complexity : O(kn) k is no of chars in a string
// Space Complexity : O(1)  as we are returning map values as a result
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. find hash code for each string. Count each character occurrence in the string and form a String as a hash.
 * 2. store strings with the key in the hashmap.
 * 3. return all values grouped by key.
 * note: hash code can be a prime multiplication. prime multiplication will not collide like a-2,b-3,c-5...
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	private int[] primes= new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
	
	public long hashCode(String str) {
		
		long hash=1l;
		
		for(char c:str.toCharArray()) {
			hash = hash*primes[c- 'a'];
		}
		return hash;		
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<Long, List<String>> map= new HashMap<>();
		
		Arrays.stream(strs).forEach(str -> {
			map.computeIfAbsent(hashCode(str), k-> new ArrayList<String>()).add(str);
		});
		
		return new ArrayList<>(map.values());

	}
	
	public static void main(String[] args) {
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		System.out.println(new GroupAnagrams().groupAnagrams(strs));
	}
}
