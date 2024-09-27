import java.util.*;

class Solution {
    // Solution using prime product and hashmap
    // Time complexity is O(nk)
    // Space complexity is O(nk)
    // Solution is submitted on leetcode with no errors
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String s: strs) {
            double primeProd = getInt(s);
            if(!map.containsKey(primeProd)){
                map.put(primeProd,new ArrayList<>());
            }
            map.get(primeProd).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    // Avoiding sorting by using prime products
    public double getInt(String s){
        int [] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        double result = 1;
        for (int i = 0; i<s.length();i++){
            result*= primes[s.charAt(i) - 'a'];
        }
        return result;
    } 
}