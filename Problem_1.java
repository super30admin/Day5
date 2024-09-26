// Time Complexity :O(n)...?
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

/*
* Your code here along with comments explaining your approach : 
* I have used primeProduct and HashMap for implementation.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       // Edge case
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        // Map for storing primeProduct of string as key and arraylist of strings as value.
        Map<Long,List<String>> map = new HashMap<>();
        for(String s : strs){
            long primeProductValue = getValue(s);
            if(!map.containsKey(primeProductValue)){
                map.put(primeProductValue, new ArrayList<>());
            }
            map.get(primeProductValue).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
    // Calculate prime product
    private long getValue(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        long res = 1;
        for(char c : s.toCharArray()){
            res = res*(primes[c - 'a']);
        }
        return res;
    }
}
