
// Time Complexity : O(n* mlog m) where n = number of works in strs, m = average length of each word
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if there are no words in the strs return empty list
        if (strs.length == 0) 
            return new ArrayList();
        // HashMap to store key value pair whre key is string and values are lists
        Map<String, List> hm = new HashMap<String, List>();
        for (String s : strs) {
            char[] charA = s.toCharArray();
            //sort the words by characters
            Arrays.sort(charA);
            String key = String.valueOf(charA);
            //if the sorted word exists as a key then create new list else add to existing
            if (!hm.containsKey(key)) 
            hm.put(key, new ArrayList());
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
    }
}