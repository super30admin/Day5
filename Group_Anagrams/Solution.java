// Time Complexity : O(n*k) where n -> no of strings, k -> worst case length of all strings
// Space Complexity : O(n*k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * For grouping anagrams together, we need a way to uniquely represent anagrams.
 * To achieve this, we use product of prime nums. When only prime numbers are considered, product of any no of prime numbers is unique.
 * So for each char we will associate a prime no.
 * For each string, we will go through of all its chars, and me take product of associated prime numbers.
 * Then for each product, we check if its entry is present in HashMap. If yes, we add current string to list associated to that product.
 * Else we add separate entry of product and associated list into HashMap and then we add current string to it.
 * At the end we return list view of values in HashMap.
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        
        
        for(int i = 0; i < strs.length;i++){
            double hash = calculateHash(strs[i]);
            
            if(map.containsKey(hash) == false){
                map.put(hash, new ArrayList<String>());
            }
            
            map.get(hash).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
    
    private double calculateHash(String s){
        int[] values = new int[]{2, 3, 5, 7, 11, 13,17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 87, 97, 101};
        
        double res = 1;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            res *= values[ch - 'a'];
        }
        
        
        return res;
    }
}