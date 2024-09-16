// Time Complexity : O(nk) where n is the number of words in strs and k is the average length of each word
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int prime[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        HashMap<Double, List<String>> anaMap = new HashMap<>();
        for(String s: strs)
        {   double res = 1;
            for(int i =0;i< s.length();i++)
            {
                res*= prime[s.charAt(i)-'a'];
            }
         List<String> arr = anaMap.getOrDefault(res, new ArrayList<String>());
         arr.add(s);
         anaMap.put(res,arr);
            
        }
        
        return new ArrayList<>(anaMap.values());
    }
}