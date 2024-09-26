//TC - O(nk) 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Long, List<String>> map = new HashMap<>();
        for( String s : strs){
            long primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    private Long primeProduct(String s){
        long result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}
