class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(String s: strs){
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String str){
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i); //d
            int prime = primes[c-'a']; // 99- 96 = 3   --> prime corresponding to d is at index 3
            result *= prime;
        }
        return result;
    }
}