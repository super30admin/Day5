
class Solution {
    // Time Complexity : O(nk) where n is length of strings array,k is length of each string
    // Space Complexity : O(n) for the HashMap
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : I tried sorting approach and got stuck.Prime numbers concept was much cleaner


    // Your code here along with comments explaining your approach
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create a hashmap to store all the unique prime products and their associated list of              strings
        Map<Long, List<String>> hashMap = new HashMap<>();
        
        //Iterate for each string inside the outer/given strings array
        for(String s: strs){
            //Get the prime product
            long primeVal = getPrimeVal(s);
            
            //If hashmap doesn't contains the primeproduct, append a new arraylist at that plae
            if(!hashMap.containsKey(primeVal)){
                hashMap.put(primeVal, new ArrayList<>());
            }
            //add the string to list of strings at each prime product key
            hashMap.get(primeVal).add(s);
        }
        //return all the list of string values for each hashmap key
        return new ArrayList<>(hashMap.values());
    }
    
    private long getPrimeVal(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        
        long ans=1;
        
        //Getting the prime product for each string which is unique for given set of characters
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans = ans*primes[ch - 'a'];
        }
        
        return ans;
    }
}
