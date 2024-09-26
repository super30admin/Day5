/*
Time- NLOG(N)
Space-O(N)

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> res= new ArrayList<>();
        Map<String, List<String>> mp= new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String key= String.valueOf(arr);
            if(!mp.containsKey(key))
            mp.put(key, new ArrayList<>());
            {
                mp.get(key).add(strs[i]);
            }
            
        }
        
        return new ArrayList<>(mp.values());
    }
}