// Time Complexity : O(N*KlogK), 
// N is number of strings, K is max length of a string in strs 
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s: strs) {
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(s);
            
        }
        
        return new ArrayList<>(map.values());
    }
}