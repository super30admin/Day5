// Time Complexity : O(nklog k)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}