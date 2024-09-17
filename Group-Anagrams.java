//time - O(NK)
//Space - O(NK)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return null;
        HashMap<Double, List<String>> map = new HashMap();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            Double primeProduct = getPrimeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<String>());
            }
            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private Double getPrimeProduct(String str){
        int[] Primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            result = result * Primes[ch-'a'];
        }
        return result;
    }
}