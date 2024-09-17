/**Leetcode Question - 49- Group Anagrams */
/**Algorithm - Get a hash code for every string in the given array jusing the computePrime method which gives the product of the prime numbers allocated to all the alphabets.
 * Use the hash code as the key in the hashmap.
 * If the hashmap contains the key, add the string to the corresponding values 
 * else add the key and value to the map
 */
/**TC- O(N) 
 * SC -O(N)
*/

public class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if(strs == null || strs.length ==0){
                return new ArrayList<>();
            }
            HashMap<Long,List<String>> map = new HashMap<>();
            for(String s: strs){
                long prime = computePrime(s);
                if(!map.containsKey(prime)){
                    map.put(prime, new ArrayList<>());
                }
                map.get(prime).add(s);
            }
            return new ArrayList<>(map.values());
        }
        private long computePrime(String s){
                int[] primes ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
                long result =1;
                for(int i =0; i<s.length();i++){
                    char c= s.charAt(i);
                    result = result * primes[c-'a'];
                }
                return result;
            }
    }
    
}
