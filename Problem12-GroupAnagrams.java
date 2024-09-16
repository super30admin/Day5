// Time Complexity : O(nklogk) ->n - no. of strs, k = length of string
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s:strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!res.containsKey(sorted)) {
                res.put(sorted, new ArrayList<>());
            }
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
