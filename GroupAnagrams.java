/**
// Time Complexity : O(n) (size of strs)
// Space Complexity : O(1) (total number of alphabets will always be same)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List> hmap = new HashMap<>();
        
        for(String s: strs)
        {
            double key = primeCal(s); 
            if(!hmap.containsKey(key))
            {
                hmap.put(key, new ArrayList());
            }
            hmap.get(key).add(s);
        }
        return new ArrayList(hmap.values());
    }
    
    private Double primeCal(String s)
    {
        int x []= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,57,59,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            result = result*x[c - 'a'];
        }
        return result;
    }
}