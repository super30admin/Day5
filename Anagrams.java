
// Time Complexity : O(n*klog(k)), where n is length of strs, and k is length of each word to be sorted.
// Space Complexity : O(n*k)?
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: didn't know the extent to which we can use library functions. 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s: strs){
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