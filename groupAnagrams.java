// Time Complexity : O(n * k) + O(n) = O(n*k)
// Space Complexity : O(n) HashMap Space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //A hashmap containing primeno multiplication and list of strings
        Map<Long, List<String>> map = new HashMap<>(); //SC: O(n)
	//TC: O(n*k)
        for(String s: strs){
            long prime = calculatePrimeMul(s); //TC: O(n) for calculating prime multiplication for each iteration
            if(!map.containsKey(prime))
                map.put(prime, new ArrayList());
            map.get(prime).add(s);
            
        }
        return new ArrayList<>(map.values()); //TC: O(n) for getting map.values
        
        
    }
    
    private long calculatePrimeMul(String s){
        //List of prime numbers to initiaze the prime number array
        int[] primeNos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long ans = 1;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            //calculate the prime no. multiplication as it yields to a unique number
            ans = ans * primeNos[c - 'a']; //char - 'a' to get the index. e.g., c - a = 067 - 065 = 2 will yield primeNos[2]
        }
        return ans;
        
    }
}