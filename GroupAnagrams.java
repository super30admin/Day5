// Time Complexity : O(nk) 
// Space Complexity : O(1)

class SolutionWithPrimeProduct {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList();;

        HashMap<Double, ArrayList<String>> map = new HashMap();

        for(int i = 0; i<strs.length; i++) {

            String str = strs[i];
            double primeProduct = getPrimeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList());
            }
            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String str) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i = 0; i<str.length(); i++){
            result = result*primes[str.charAt(i) - 'a'];
        }
        return result;
    }
}
