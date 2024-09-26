// Time Complexity : O(N Log N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
    For each string in the array, sort the characters. The sorted string is the key.
    If the key doesn't exist in the map, we create a new ArrayList.
    We add this string as a value in the map. 

*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)){
                 ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
        
    }
}