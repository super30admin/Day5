// Overall Time Complexity : O(n * m). The n is number of characters in the string and m is the average length iterating over the strings.
// Overall Space Complexity : O(n + m). The space complexity is n is  number of unique groups (or keys) and m is the total number of elements (or values) stored across all groups
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

// For each string, calculate its prime product by mapping characters to primes.
// Store the prime product as the key and group the strings with the same prime product in a HashMap.
// Finally, return the grouped anagrams as a list of lists.

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String s: strs){
            double pm_pd = PrimeProducts(s);
            if(!map.containsKey(pm_pd)){
                map.put(pm_pd, new ArrayList<>());            
            }
            map.get(pm_pd).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
    private double PrimeProducts(String s){
        int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31, 37, 41, 43, 47, 53,59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double result=1d;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            result=result*(prime[c-'a']);
        }
        return result;
    }
}