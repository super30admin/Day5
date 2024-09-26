// Time Complexity : O(n*slogs) n = length of strs, s is length of longest string.
// slogs is sorting of each string, this is done for all strings in strs!
// Space Complexity : O(n*s) n = number of words in list, s is length of longest string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charac = s.toCharArray();
            Arrays.sort(charac);
            String keystring = String.valueOf(charac);
            if(!map.containsKey(keystring)) {
                map.put(keystring, new ArrayList<>());
            }
            map.get(keystring).add(s);
        } return new ArrayList<>(map.values());
    }
}