// Time Complexity : O(NK) Where N is length of string strs and k is length of individual string.
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//using two HashMaps

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s: strs){
            double primeProduct = primeProduct(s); //helper function to calculate prime product of elements of string
            if (!map.containsKey(primeProduct)){ // if prime product does not already exist in HashMap then we create a new list and map prime product to original string
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    private double primeProduct(String str){
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103}; //first 26 prime numbers
        for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        int prime = primes[c - 'a']; //c - 'a' calculates index based on ASCI values of characters and fetches prime number from primes array
        result *= prime;
        }
        return result;
    } 
}
