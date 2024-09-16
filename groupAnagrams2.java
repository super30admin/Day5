// Time Complexity : O(NK) //N is iteration through array, K is iteration through a string
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Long, List<String>> anaMap = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            long primeProd = calculatePrimeProd(s, primes);
            
            //check existence
            if(!anaMap.containsKey(primeProd))
                anaMap.put(primeProd, new ArrayList<String>());
            //adding string to anagram list
            anaMap.get(primeProd).add(s);
        }
        return new ArrayList<>(anaMap.values());
    }
    
    private Long calculatePrimeProd(String s, int[] primes){
        //cannot multiply with 0 so use 1
        long primeProd = 1L;
        
        for(int i = 0; i < s.length(); i++)
            
            //s.charAt(i) - 'a'(97)
            primeProd *= primes[s.charAt(i) - 'a'];
        
        return primeProd;
    }
}