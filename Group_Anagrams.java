    
		// Time Complexity : O(NK)
	// Space Complexity : O(NK)
	// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this :
	// Had a problem of not able to come up with hashMaps key  
	//Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        HashMap<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        
        for(String str :strs){
            Arrays.fill(count,0);
              char[] chArray = str.toCharArray();
            
            for(char ch :chArray){
                count[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
           
            
            for(int i =0 ;i<26;i++){
                 sb.append('#');  
                 sb.append(count[i]);
            }
         
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(str);
        
        }
        
       return new ArrayList(map.values());

}
     
}
