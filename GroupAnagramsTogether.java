
// Time Complexity : O(L*n) -> L is length of String and n is number of strings
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Anagrams: two Strings are anagrams if we can reshuffle the chracters in one string to form another.
 * 
 * Approach: 
 * In a hashmap if two strings have the same hashvalue, there will be collisions. 
 *  We can use this to our advantage if we can have two strings that have the same characters collide into the same cell.
 * 
 * So the primary idea to solve this is to define a hashfunction that returns the same hashValue for two Anagrams.
 * 
 * Here we can use the primefactorization hashing, where each character is assigned a primenumber and we calculate the hashvalue for each string by multiplying the number associated to the chracter.
 * 
 * 
 */

import java.util.*;

public class GroupAnagramsTogether {

    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primeNumber = listOfPrimeNumbers(27);
        Map<Double, List<String>> cache = new HashMap<>();

        for (String str : strs) { // O(n)
            double hashValue = 1;
            for (int i = 0; i < str.length(); i++) { // O(L)
                hashValue = hashValue * primeNumber[str.charAt(i) - 'a'];
            }

            if (!cache.containsKey(hashValue)) {
                cache.put(hashValue, new ArrayList<>());
            }
            cache.get(hashValue).add(str);
        }

        List<List<String>> output = new ArrayList<>();

        for (Map.Entry<Double, List<String>> entry : cache.entrySet()) {
            output.add(entry.getValue());
        }

        return output;
    }

    private int[] listOfPrimeNumbers(int n) {
        return new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101 };
    }
}
