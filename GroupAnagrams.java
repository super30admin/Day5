//Time Complexity: O(N*K) ; N length of array, K is length of string
//Space Complexity: O(N*K)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes ={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Map<Long,List<String>> map = new HashMap<>();
        for(int i=0;i< strs.length;i++){
            long product = calculatePrimeProduct(strs[i],primes);
            if(!map.containsKey(product))
                map.get(product).add(strs[i]);
        }else{
            map.put(product,new ArrayList<String>());
            map.get(product).add(strs[i]);
        }
    }
        return new ArrayList<>(map.values());
}
    public long calculatePrimeProduct(String s, int[] primes){
        long prod = 1L;
        for(int i=0;i<s.length();i++){
            prod = prod * primes[s.charAt(i) - 'a'];
        }
        return prod;
    }

}