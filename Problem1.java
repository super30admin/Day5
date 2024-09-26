class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        
        for (String str : strs) {
            char[] freq = new char[256];
            for (char c : str.toCharArray()) {
                freq[c]++;
            }
            
            String key = String.valueOf(freq);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(str);
        }
        
        return new ArrayList<>(ans.values());   
    }
}