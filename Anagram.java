// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();
        for(String str:strs){
            long key = primeProduct(str);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
          map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    public long primeProduct(String str){
        long result = 1;
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for(int i = 0; i < str.length();i++){
            result *= prime[str.charAt(i)-'a'];
        }
        return result;
    }
}