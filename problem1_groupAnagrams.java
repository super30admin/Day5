// Time Complexity :
//      n - string array length
//      k - length of each string
//      time for sorting each string: k log(k)
//      total time complexity will be O(nklog(k))
//
// Space Complexity :
//      groupAnagrams() - O(nk)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();
        char [] sortStr;
        for(int i=0; i<strs.length; i++)
        {
            sortStr = strs[i].toCharArray();
            Arrays.sort(sortStr);
            String word = String.valueOf(sortStr);
            if(!hs.containsKey(word))
            {
                hs.put(word, new ArrayList<String>());    
            }
            hs.get(word).add(strs[i]);
        }
        return new ArrayList<>(hs.values());
    }
}