// Problem 1: 

// Time Complexity : O(n) -
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            } 
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}