// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            double key=getHash(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList(map.values());
    }
    
    public double getHash(String s){
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        double key=1;
        for(char c:s.toCharArray()){
            key=key*primes[c-'a'];
        }
        return key;
    }
}