//Time Complexity: O(N*K) [N = length of input array, K = length of the string]
//Space Complexity: O(N)
//For the solution, we calculate the prime product of the strings. For each string that has the same prime product
//we store it in the corresponding hashmap value.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            double primeProduct = calculateProduct(strs[i]);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    private double calculateProduct(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
        double result = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}