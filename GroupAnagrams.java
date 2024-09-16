//TimeComplexity : O(nk)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double,List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            double primeProduct = getPrimeProduct(s);
            if(!map.containsKey(primeProduct))
                map.put(primeProduct,new ArrayList<>());

            map.get(primeProduct).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String s){
        double result =1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        for(int i=0;i< s.length(); i++)
        {
            char c = s.charAt(i);
            int prime = primes[c-'a'];
            result = result * prime;
        }
        return result;
    }
}