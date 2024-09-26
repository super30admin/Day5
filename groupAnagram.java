// Time Complexity : O(NKlogK) - N: length of string and K = maximum length of string
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for(String str : strs){
            char tempArray[] = str.toCharArray(); 
            Arrays.sort(tempArray);
            String key = String.valueOf(tempArray);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(str);
        }
        
        return new ArrayList(ans.values());
           
    }
}