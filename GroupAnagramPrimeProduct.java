import java.util.*;
// Time Complexity : O(n l), where l = length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class GroupAnagramPrimeProduct {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String str : strs){
            Long l = primeProduct(str);
            if(!map.containsKey(l)){
                map.put(l, new ArrayList<>());
            }
            map.get(l).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private long primeProduct(String str){
        long result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            result *= primes[ch - 'a'];
        }
        
        return result;
    }
}