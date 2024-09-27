// Time Complexity :  m(iterate through string array) * n (iterate through length of str to fing unique multiplication)
// Space Complexity : O(N) - for hashmap (array is contant for prime number so O(1) for that)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : First approach was m * nlogn 


// Your code here along with comments explaining your approach
// 1) get the unique code using calcPrime function for every string
// 2) put the function return value as key in the Map 
// 3) if anagram string comes same unique value is returned from calPrime function
// 4)  if the key is same the current string is added in the list for the same key which already has anagram in it.
// 5) finally return the map values

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long,ArrayList<String>> h = new HashMap<>();
    	
        for(String s:strs) { //m
            long uniqueMul = calcPrime(s);
            
        	if(! h.containsKey(uniqueMul)) {
        		h.put(uniqueMul,new ArrayList<>());
        	}
            h.get(uniqueMul).add(s);
        }
        
        return new ArrayList(h.values());
    }
    
    private long calcPrime(String s){
        long target =1;
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            target = target * prime[c-'a'];
        }
        
        return target;
    }
}