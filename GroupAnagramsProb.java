package Oct19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagramsProb {
	
    public List<List<String>> groupAnagrams(String[] strs) {
       
// Time Complexity: O(nk) where n is the no.of elements in the given array and k is the length of each individual string. We are iterating over the whole array and then each string of the array.

// Space Complexity: O(n) 
// Because we are using an array of constant length(=26). So, its space complexity is O(1). 
// Also, we are using hashmap which can contain max n no.of entries, in case all n elements in the given array are non-anagrams with any other element in the array. 
        
// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Approach: Prime Product approach used to solve the problem.
// Array of prime nos.created to represent each of the 26 alphabets in lower case(Lower case mentioned in problem statement, so solution scope limited to the same)
// Iterate through the array and then iterate through each character in the string element under processing.
// Find the ascii value for the character under processing to determine the prime no.from the 'prime' array applicable for that character
// Multiplication of such unique prime no.s for each of the characters in string will give a unique number for every string which is non anagram with another.
// Anagrams will share this unique no., so we can add the anagram strings(if any) from the given array to the value in hashmap corresponding to the unique number.
        
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        Map<Long, List<String>> hm = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            
            String cur = strs[i];
            long key = 1;
            
            for (char c: cur.toCharArray()) {
                int ascii = c - 'a';
                key *= prime[ascii];
            }
            
            if (!hm.containsKey(key)) {
                List<String> temp = new ArrayList<>();
                temp.add(cur);
                hm.put(key, temp);
            } else {
                List<String> temp2 = hm.get(key);
                temp2.add(cur);
                hm.put(key, temp2);
            }
                
        }
        
        // create a list for holding the result and add every value of hashmap to the list.
        // note that every list will hold many sublists after the hashmap has been iterated completely.
        List<List<String>> result = new ArrayList<List<String>>();
        
        for (Map.Entry<Long, List<String>> entry: hm.entrySet()) {
            result.add(entry.getValue());
        }
        
        return result;
     
    }
}
