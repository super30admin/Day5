// Time Complexity :O(nl)
// Space Complexity : O(nl)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // edge case
        if(strs.length==0 || strs==null) return new ArrayList<>();
        
        Map<Long,List<String>> myMap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            
            Long pp = primeProduct(strs[i]);
            // if prime of string is not in map add it else add it to list for corresponding prime
            if(!myMap.containsKey(pp)){
                myMap.put(pp,new ArrayList<>());}
                          
                 myMap.get(pp).add(strs[i]);
            }      
            
        return new ArrayList<>(myMap.values());
        }
        
       
        

    
    public Long primeProduct(String str){
        long res = 1;
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103
    };
    // for each char of string do (ascii value - 97) and take prime number for that result
    for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        int p = prime[c -'a'];
        // product of primes for all characters in string
        res = res * p;
    }
    
    return res;}
}