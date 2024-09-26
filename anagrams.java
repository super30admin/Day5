// Time Complexity: O(1)
// Space Complexity: O(k log n)
// Did this code successfully run on Leetcode: Yes




import java.util.*; 
public class anagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<Double, List<String>> map = new HashMap<>();
            for(String str: strs){
                double primeval = primeProduct(str);
                if(map.containsKey(primeval)){
                    map.get(primeval).add(str);
                }
                else{
                    map.put(primeval, new ArrayList<>());
                     map.get(primeval).add(str);
                }
                
            }
            return new ArrayList<>(map.values());
            
            
        }
        private double primeProduct(String s){
            int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
            double result =1;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                result = result * primes[c - 'a'];
            }
            return result;
        }
    
}
