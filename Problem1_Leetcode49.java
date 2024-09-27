// Time Complexity : Solution 1: O(N(KlogK)) | Solution 2: O(NK)
// Space Complexity : Solution 1: O(N) | Solution 2: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Solution 1: By sorting the string
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // base case
        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();

        // we need to use hashmap to store sorted string as a key and List of matched strings against each key
        Map<String, List<String>> map = new HashMap<>();

        // Iterating over array of words TC: O(N)
        for(int i = 0; i < strs.length; i++) {

            // get each string from array. sort the string (TC: K(logK))
            String str = strs[i];
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sortedString = String.valueOf(charStr);

            // check if sorted string is alreay in hashmap as a key
            // if not present then create a new list
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<String>());
            }

            // get the key from the map and add matched string in the list
            map.get(sortedString).add(str);
        }

        // Total TC: N*K(logK)
        // return all lists in a new list
        return new ArrayList<List<String>>(map.values());
    }
}

// Solution 2: By creating prime product based on each character
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // base case
        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();

        Map<Double, List<String>> map = new HashMap<>();

        // Iterating over array of words TC: O(N)
        for(int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeProduct = getPrimeProduct(str);

            // here primeProduct will be our key and rest of the things are same as above solution
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<String>());
            }

            map.get(primeProduct).add(str);
        }

        // here TC improves compare to previous solution TC: O(N*K)
        return new ArrayList<List<String>>(map.values());
    }

    private double getPrimeProduct(String str) {
        // here instead of sorting the string we will. create an array of prime numbers assigned to each characters. size of the array will be 26(constant)
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;

        // iterating over the string characters TC: O(K)
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // primes[c - 'a'] this will give you index of the character and prime number associated to it
            result = result * primes[c - 'a'];
        }

        // return the calculated prime product
        return result;
    }
}