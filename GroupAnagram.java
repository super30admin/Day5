// Time Complexity : O(n2)
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long, List<String>> hashmap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            
            long total=calculatePrime(strs[i]);
            
            if(!hashmap.containsKey(total)){
                 hashmap.put(total, new ArrayList<>());
            }
            
            hashmap.get(total).add(strs[i]);
        }
        
        return new ArrayList<>(hashmap.values());
        
    }
    
    public long calculatePrime(String str){
        
         long total=1;
         int[] primeArray={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
            
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                total=total * primeArray[c-'a'];
            }
            return total;
        } 
}