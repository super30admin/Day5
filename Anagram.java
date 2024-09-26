import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        
        if(strs == null || strs.length ==0)
            return new ArrayList<>();
        
        for(String str:strs) {
            char [] tmp = str.toCharArray();
            Arrays.sort(tmp);            
            String sorted = String.valueOf(tmp);
            
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
                
            }
            map.get(sorted).add(str);
        }
        
        return new ArrayList<>(map.values());
        
    }
}