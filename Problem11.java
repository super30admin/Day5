// Time Complexity: O(nk) where n is the number of strings in input String array and k is the length of each string
// Space Complexity : O(n)


// Approach:
//     Here we will use the prime numbers as the multiplication of prime will not lead to collision.
//     Create a map that stores Long as key & List<String> as value, loop through the string Array
//     Calculate the multiplication for each string
//     Put the multiplication value as key as key and add this string to the arraylist as part of values

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length<1) return new ArrayList<>();
        
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        Map<Long, List<String>> hm = new HashMap<>();
        
        for(String s: strs){
            
            long key = calculateKey(s,primes);
            
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }

            hm.get(key).add(s);
        }
        
        return new ArrayList<>(hm.values());
    }
    
    //helper method to calculate the key of hashmap
    public long calculateKey(String s, int[] primes){
        long key = 1;
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            key *= primes[c-'a'];
        }
        return key;
    }
}