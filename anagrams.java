// Given an array of strings, group anagrams together.
// Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
// Note: All inputs will be in lowercase. The order of your output does not matter.

// Time Complexity : O(nk) 
// Space Complexity : O(1) - constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, I used hashmap to keep tract of prime factorization and list of array of words. Here, we find Prime factorization of each word present 
 * in strings array. Then, we compare if the hashmap contains that prime factorization. If it is not present, we make an entry with prime
 * factorization as key and corresponding string as value. If it is already present we just add the string to the list of array.
 */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> hMap = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            double prime = primeFactorization(strs[i]);
            if(hMap.containsKey(prime)){
                hMap.get(prime).add(strs[i]);
            }
            else{
                hMap.put(prime, new ArrayList<>());
                hMap.get(prime).add(strs[i]);
            }
        }
        return new ArrayList<>(hMap.values());
    }

    private double primeFactorization(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
         67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for(int i= 0; i<s.length(); i++){
            result = result * primes[(s.charAt(i)-'a')];
        }
        return result;
    }
}