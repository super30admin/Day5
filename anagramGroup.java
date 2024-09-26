// Time Complexity - O(N Klog(K))
// Space Complexity - O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :no
//Approach:
//First tried with the sorting technique for which we sorted each and every element by character
// by converting it in a character array and then again converting into a string

//First we create a HashMap with the Long and List of String elements
// we find the prime Products of the 26 characters since the prime products are always unique and after that we 
// create a map with unique products and map them with equal values  and return the values of the map
// This method eleminates the sorting process

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0){
           return new ArrayList<>();
       }
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String s: strs){
            long key = primeProduct(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private long primeProduct(String s){
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long result = 1;
        for(int i = 0; i < s.length(); i++){
            result = result * primes[s.charAt(i) - 'a'];
        }
        return result;
    }
}