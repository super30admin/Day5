// Time Complexity = O(n*k) n - number of strings, k number of characters in string
// Space Complexity = O(n) - number of unique anagrams
class Solution {
    private static int [] arr = new int [] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,83,89,97,101,103};
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            double key = getKey(s);
            
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private Double getKey(String s) {
        double key = 1;
        
        for(Character c : s.toCharArray()) {
            key *= arr[c - 'a'];
        }
        
        return key;
    }
}
