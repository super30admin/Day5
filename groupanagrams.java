// groupAnagrams
// Time Complexity : O(n)
// Space Complexity : O(nlogk) k: Average length of the string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(int i = 0; i<strs.length ; i++) {
            char[] toSort = strs[i].toCharArray();
            Arrays.sort(toSort);
            String sorted = String.valueOf(toSort);
            
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
            
        }
        return new ArrayList<>(map.values());
            
        
        }
        
}
