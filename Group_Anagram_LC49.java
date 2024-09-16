// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> smap = new HashMap<>();
        
         
        
        for(int i=0; i<strs.length;i++){
    char[]  c = strs[i].toCharArray();
        Arrays.sort(c);
        String s= new String(c);
        if(!smap.containsKey(s)){
            smap.put(s,new ArrayList<>());
        }
        smap.get(s).add(strs[i]);
        }
        res.addAll(smap.values());
        return res;
    }
}