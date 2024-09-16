// Time Complexity : O(nk), n = length of array, k = length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return result;
        }
        Map<Double, List<String>> map = new HashMap<>();
        for(String s: strs){
            double hashVal = hashFunction(s);   
            List<String> li = map.getOrDefault(hashVal, new ArrayList<>());
            li.add(s);
            map.put(hashVal, li);
        }
        for(Double key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
    public Double hashFunction(String s){
        int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                       79, 83, 89, 97, 101, 103};
        double hashVal = 1.0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            hashVal *= primes[c - 'a'];
        }
        return hashVal;
    }
}
