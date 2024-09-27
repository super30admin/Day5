class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long,List<String>> map = new HashMap<Long,List<String>>();
        
        for (int i=0;i<strs.length;i++)
        {
          long ans =calculate(strs[i]);
            
            if(!map.containsKey(ans))
            {
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(strs[i]);
        }
       return new ArrayList<>(map.values());
        
    } 
    
    private long calculate(String s)
    {  
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        
      
        long ans =1;
        for(int i=0;i<s.length();i++)
        {
           char c = s.charAt(i); 
            ans= ans * arr[c-'a'];
        }

        
      return ans;  
    }
    
}  