// Time Complexity : O(N*M) N - number of string and M - number of chars in string
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
// The basic idea is to create a char array mapping for every string in the given input and and store the string and its anagrams as key value pairs in the hashmap
// The anagrams will always have the same char array mapping and will be added to the map under the same key thus grouping the anagrams in the map for the same key.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            char[] cArr = new char[26];
            
            for(char c: strs[i].toCharArray()) {
                cArr[c-'a']++;
            }
            String key = String.valueOf(cArr);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
}