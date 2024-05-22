// Time Complexity : O(n*k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only

//The primeProduct method calculates this product by multiplying predefined prime numbers assigned to each letter
// ('a' = 2, 'b' = 3, ..., 'z' = 101). Strings with the same product are anagrams and are grouped
// together in the hash map, which is then converted to a list of lists for the final result.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        // Initialize a hash map to store lists of strings. The keys are the prime products, and the values are lists of strings that share the same product.

        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i =0; i< strs.length ;i++){

            String s = strs[i];
            double product = primeProduct(s);

            // For each string, compute its prime product. If this product is not in the map, add it with a new list. Append the string to the list corresponding to its product.

            if(!map.containsKey(product)){
                map.put(product, new ArrayList<>());
            }

            map.get(product).add(s);
        }

        return new ArrayList<>(map.values());
    }
    private double primeProduct(String s){

        //For each string, calculate a unique product by multiplying prime numbers corresponding to each character (e.g., 'a' = 2, 'b' = 3, etc.).

        int []prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1;
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            result = result * prime[ch - 'a'];
        }
        return result;
    }
}