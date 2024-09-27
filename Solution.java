class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Long, List<String>> map = new HashMap<>();
        
        for(String s: strs){
            long primeProducts = primeProducts(s);
            if(!map.containsKey(primeProducts)){
                map.put(primeProducts, new ArrayList<>());
            }
                map.get(primeProducts).add(s);
        }
        return new ArrayList<>(map.values());
    
    }
    
    private Long primeProducts(String s){
        long result = 1;
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result * prime[c - 'a'];
        }
        return result;    
    }
    
}
