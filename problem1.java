// Time Complexity : O(nK) where n is the input and k is the max length of the input string
// Space Complexity : O(nK) where n is the input and k is the max length of the input string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[26];
        
        for(int i=1001,j=0;j<26;i++,j++)
            arr[j]=i;
        
        Map<Integer, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str:strs){
            int num=1;
            for(Character ch:str.toCharArray())
                num*=arr[ch-'a'];
            map.computeIfAbsent(num,k->new ArrayList<String>()).add(str);
        }
        
        res.addAll(map.values());
        
        return res;
    }
}