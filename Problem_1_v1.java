class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        Map<Long, List<String>> hashMap = new HashMap<>();
        
        for(String word : strs){
            // char[] ch = word.toCharArray();
            // Arrays.sort(ch);
            // String sortedString = String.valueOf(ch);
            Long primeProduct = this.calculatePrimeProduct(word);
            
            if(!hashMap.containsKey(primeProduct)){
                hashMap.put(primeProduct, new ArrayList<>());
            }    
            
            hashMap.get(primeProduct).add(word);
        }
        
        return new ArrayList<>(hashMap.values());
    }
    
    private Long calculatePrimeProduct(String word){
        
        int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157};
        
        Long result = 1L;
        
        for(int i=0; i<word.length(); i++){
            
            result = result * primes[word.charAt(i) - 'a'];
            
        }
        
        return result;
    }
}