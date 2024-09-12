// Time Complexity : O(nk) where n is the number of strings and k is the average length of each string
// Space Complexity : O(1) because there are only 26 alphabets
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null){
            return new ArrayList<>();
        }
        
        HashMap<Double, List<String>> map = new HashMap<>();
        
        // Iterate over each string and find the prime product
        
        for(int i = 0; i < strs.length; i++){
            double primeProduct = findProduct(strs[i]); //using double to avoid integer overflow
            if(!map.containsKey(primeProduct)){
                // Found an anagram
                map.put(primeProduct, new ArrayList<>());
            }
            
            map.get(primeProduct).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private double findProduct(String str){
        int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double product = 1;
        for(int i = 0; i < str.length(); i++){
            // Each letter corresponds to a prime number
            // Finding the index by using the ASCII value of the character
            product = product * primeArray[str.charAt(i) - 'a'];
        }
        return product;
    }
}