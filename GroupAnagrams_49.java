// Time Complexity : O(nk) n= number of string and k = avrage length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            double prime= calculatePrime(s);
            if(!map.containsKey(prime)){
                map.put(prime, new ArrayList<String>());
            }
            
            map.get(prime).add(s);
        }
        
        return new ArrayList<>(map.values());
        
    }
    
    public double calculatePrime(String s){
        int[] primes=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        
        double resultPrime = 1;
        
        for(char c:s.toCharArray()){
            resultPrime = resultPrime * primes[c - 'a'];
        }
        
        return resultPrime;
    }
}