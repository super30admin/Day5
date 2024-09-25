/*
   
Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.
*/

//Time comlpexity - O(nk)
//space complexity - O(nk)
// Did this code successfully run on Leetcode : Yes
/*
Any problem you faced while coding this : None

*/

// Your code here along with comments explaining your approach
/*
  String will be anagram if their character count for each character is same

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            List<String> list = anagrams.getOrDefault(sortedStr, new ArrayList<String>());
            list.add(str);
            anagrams.put(sortedStr, list);
        }
        List<List<String>> res = new ArrayList<>();
        for(String key : anagrams.keySet()) {
            res.add(anagrams.get(key));
        }
        return res;
    }
}