class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            
            double primeProduct = calculatePrimeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private double calculatePrimeProduct(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double product = 1;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            product = product * primes[c - 'a'];
        }
        return product;
    }
}