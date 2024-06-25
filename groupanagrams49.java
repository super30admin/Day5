// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used a hashmap to maintain the pattern
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            if(!map.containsKey( new String(tempArray))){
                map.put(new String(tempArray), new ArrayList<>());
            }
            map.get(new String(tempArray)).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
