// 49. Group Anagrams - https://leetcode.com/problems/group-anagrams/
// Space Complexity - O(1)
// Time Complexity - O(1)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word: strs)
        {
            String sort = sortStr(word);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(word);
        }
        return convertToList(map);
    }
    
    private List<List<String>> convertToList(Map<String, List<String>> map)
    {
        List<List<String>> result = new ArrayList<>();
        
        for(List<String> anagrams: map.values())
        {
            result.add(anagrams);
        }
        return result;
    }
    
    private String sortStr(String word)
    {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);      
    }
}