// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : 6ms

// Your code here along with comments explaining your approach


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        
        if(strs.length == 0 || strs == null){
            return ans;
        }
        
         Map<String, List<String>> map = new HashMap<>();
         
        for(String str : strs){
            
            String sort = sortStr(str);
            
            if(map.containsKey(sort)){
                
                map.get(sort).add(str);
                
            }
            
            else{
                
                map.put(sort, new ArrayList<>());
                
                map.get(sort).add(str);

            }
            
        }
        for(List<String> list: map.values()){
            
            ans.add(list);
            
        }
        
        return ans;
        
    }
    
    // Creating an Hash and using as a Key for mapping
    public String sortStr(String str){
        
        char[] c = str.toCharArray();
        
        Arrays.sort(c);
        
        return new String(c);
        
    }
    
}