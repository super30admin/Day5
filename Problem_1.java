
// Time Complexity : O(n * k) , n = length of string array, k = length of the strings
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// In order to group anagrams together, we use an approach where each letter is mapped to a unique value.
// Here we map the letters to prime numbers so that the product remains unique.
// If the words have same letters the calculated product of the numbers with the same letters will 
// be same and we will use this unique product as key in a Map.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem_1 {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long, List<String>> hashMp = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
        	long hashValue = 1;
            for(int j = 0; j<strs[i].length(); j++){
                 hashValue *= (long) getHashValue(strs[i].charAt(j)) ;
            }
            if(!hashMp.containsKey(hashValue)) {
            	hashMp.put(hashValue, new ArrayList<>());
            }
            hashMp.get(hashValue).add(strs[i]);
        }
		return new ArrayList<>(hashMp.values());
    }
 
 public int getHashValue(char c) {
	 int[] primes = {2,3,5,7,11,13,17,19,23,29,
             31,37, 41,43,47, 53, 59,61,67,71,73,79,83,89, 97,101};
	 int hashValue =  primes[(int)c - (int)'a'] ;
	 return hashValue;
 }

}
