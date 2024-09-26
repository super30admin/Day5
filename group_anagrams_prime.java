// in this approach we make use of prime no.s to create a unique product then map that to ones with same product 
// all those with same product are anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0) {
           return new ArrayList<>();
       }
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str: strs) {
            double primeProduct = getPrimeProduct(str);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
}
    private double getPrimeProduct(String s) {
        double result = 1;
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int prime = primes[ch - 'a'];
            result = result * prime;
        }
        return result;
    }
}