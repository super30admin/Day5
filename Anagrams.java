class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Double, List<String>> map = new HashMap();
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(map.containsKey(primeProduct)){
                map.get(primeProduct).add(strs[i]);
                continue;
            }
            List<String> str = new ArrayList<>();
            str.add(strs[i]);
            map.put(primeProduct, str);
        }

        return new ArrayList<List<String>>(map.values());
    }

    double primeProduct(String s){
        int[] primes ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double primeProduct = 1;
        for(int i=0; i<s.length(); i++){
            primeProduct *= primes[s.charAt(i) - 'a'];
        }
        return primeProduct;
    }
}
