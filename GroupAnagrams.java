// Time Complexity :O(N*k) N : length of string, K : Max of that string
// Space Complexity :O(N*k) N : length of string, K : Max of that string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str:strs){
            double pproduct = primeproduct(str);
            if(!map.containsKey(pproduct)){
                map.put(pproduct,new ArrayList<>());
            }
            map.get(pproduct).add(str);
        }
        return new ArrayList<>(map.values());
    }


    private double primeproduct(String s){
        double result =1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            result = result  * primes[c -'a'];
        }
        return result;
    }
}