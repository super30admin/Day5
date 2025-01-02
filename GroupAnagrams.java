/* Description: Taking each string, getting the hash equivalent of each character in it and multiplying
and storing the product as key and appending the original string in the list. Then returning all the value from 
hashmap.
 */
// Time Complexity : O(nklogk) for 1st approach and O(nk) for second
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
// By storing sorted values as keys: 
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check base condition
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        // Initialization of hashmap to put the sorted word as key and group them into
        // one in value
        HashMap<String, List<String>> map = new HashMap<>();
        // Running a loop
        for (int i = 0; i < strs.length; i++) {
            // Taking the first string from list
            String s = strs[i];
            // Converting into array of characters to sort it
            char[] ch = s.toCharArray();
            // Sorting it
            Arrays.sort(ch);
            // Converting array back to one single string
            String sorted = String.valueOf(ch);
            // Checking if that sorted value is already present in map or not
            if (!map.containsKey(sorted)) {
                // If not, add that sorted string as key and create new arraylist in its value
                map.put(sorted, new ArrayList<>());
            }
            // Simply append the original string in the list of values
            map.get(sorted).add(s);
        }
        // Return all the list of values in a new list
        return new ArrayList<>(map.values());
    }
}

// By storing hash equivalent as keys:
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check base condition
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        // Initialization of hashmap to put the hash equivalent as key and group them
        // into
        // one in value
        HashMap<Double, List<String>> map = new HashMap<>();
        // Running a loop
        for (int i = 0; i < strs.length; i++) {
            // Taking the first string from list
            String s = strs[i];
            // Getting the hash equivalent of that string
            double primeProduct = primeProduct(s);
            // Checking if that hash value is already present in map or not
            if (!map.containsKey(primeProduct)) {
                // If not, add that hash value as key and create new arraylist in its value
                map.put(primeProduct, new ArrayList<>());
            }
            // Simply append the original string in the list of values
            map.get(primeProduct).add(s);
        }
        // Return all the list of values in a new list
        return new ArrayList<>(map.values());
    }

    // Method to get the hash equivalent
    private double primeProduct(String s) {
        // Some predefined prime numbers, we will be using prime numbers bcoz product of
        // prime numbers is always unique
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // For each character in string, get the prime number associated and multiply.
            // Primes[character-'a'] will give the index that is the ASCII value of
            // character
            result = result * primes[c - 'a'];
        }

        return result;
    }
}