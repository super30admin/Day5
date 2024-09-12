// Time Complexity : Mentioned before each approach
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Approach 1: Using Sorting
Time Complexity = O(nklogk)
Space Complexity = O(nk), where n is the number of strings and k is the avg length of each string. While returning we are creating a new ArrayList which will not be counted in the space complexity since its the expected return value, but the internal HashMap being used for storing n strings each of size k will contribute to the space complexity.
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();

        // Map will have key as sorted string and value as the list of strings that form the unique sorted string
        Map<String, List<String>> map = new HashMap<>();

        for (String s:strs) {
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            String currStr = String.valueOf(cArr);
            if (!map.containsKey(currStr))
                map.put(currStr, new ArrayList<>());
            map.get(currStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}


/*Approach 2: Using Prime Product
Time Complexity = O(nk)
Space Complexity = O(nk), where n is the number of strings and k is the avg length of each string
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();

        // Map will have key as primeProduct and value as the list of strings that form the unique primeProduct
        Map<Double, List<String>> map = new HashMap<>();

        for (String s:strs) {
            //Get the unique prime product
            double pProduct = primeProduct(s);

            // If the primeProduct is not present add it to the HashMap, with its value being ne ArrayList
            if (!map.containsKey(pProduct))
                map.put(pProduct, new ArrayList<>());

            // Add the string to the primeProduct key
            map.get(pProduct).add(s);
        }

        // Return the ArrayList of the values in the HashMap, which is the expected return type
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s) {
        // Hardcode the list of first 26 prime numbers
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double product = 1;

        // Multiply each characters prime number, since its product will be unique.
        for (char c: s.toCharArray()) {
            product *= primes[c-'a'];
        }

        return product;
    }
}