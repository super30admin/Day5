// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class GroupAnagrams {
    
    public boolean isPrime(int n) {
        
        double sq = Math.sqrt(n);
        
        for(int i = 2; i <= sq; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0 || strs == null) {
            return new ArrayList<>();
        }
        List<Integer> primes = new ArrayList<>();
        Map<Double, List<String>> map = new HashMap<>();
        for(int i = 2; i <= 105; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }

        for(String str: strs) {
            double product = 1;
            for(char ch: str.toCharArray()) {
                product *= primes.get(ch - 'a');
            }
            
            if(!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(str);
            
        }
                
        return new ArrayList<>(map.values());
    }
}