// Time Complexity : O(NK)
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String,List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s: strs){
            Arrays.fill(count,0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0 ; i< 26 ; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}