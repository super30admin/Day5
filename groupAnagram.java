// Time Complexity : O(NlogN)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap();
        
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String temp = String.valueOf(ch);
            
            if(!map.containsKey(temp))
                map.put(temp, new ArrayList());
            map.get(temp).add(s);           
        }
        
        List<List<String>> result = new ArrayList();
        
        for(String s : map.keySet()) {
            result.add(map.get(s));
        }
        return result;
    }
}