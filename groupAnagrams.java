class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            
            map.putIfAbsent(key,new ArrayList<String>());
            
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}