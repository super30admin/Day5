// Time complexity: O(nk log k)
// Space complexity: O(nk)
// Did it run successfully on Leetcode: YES

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            char[] cArray = strs[i].toCharArray();
            Arrays.sort(cArray);
            String sorted = String.valueOf(cArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            } 
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}