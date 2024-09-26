import java.util.*;

public class Anagrams {
    // Method 1
    /*
    // Time Complexity : O(nklogk)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this :no
     */
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for(int i=0; i<strs.length; i++){
                char charArr[] = strs[i].toCharArray();
                Arrays.sort(charArr);
                String sorted = String.valueOf(charArr);
                if(!map.containsKey(sorted)){
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(strs[i]);
            }
            return  new ArrayList<>(map.values());
        }
        // Method 2 Prime form factor
     /*
    // Time Complexity : O(nk)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : no
     */
        class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<Double, List<String>> map = new HashMap<>();

            for(int i=0; i<strs.length; i++){

                double primeProduct = calculatePrime(strs[i]);
                if(!map.containsKey(primeProduct)){
                    map.put(primeProduct, new ArrayList<>());
                }
                map.get(primeProduct).add(strs[i]);
            }
            return  new ArrayList<>(map.values());
        }
        private double calculatePrime(String s){
            int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
            double result = 1;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                result = result * primes[c-'a'];
            }
            return result;

        }
    }
}
