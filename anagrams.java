/**
problem: group anagrams
https://leetcode.com/problems/group-anagrams/

Time complexity: O(n * m) where n = number of strings, and m = string length of longest string
Space complexity: O(n)
*/
class anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            int hash[] = new int[26];
            
            for(int i = 0; i < str.length(); ++i) {
                ++hash[str.charAt(i) - 'a'];
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < 26; ++i) {
                if (hash[i] != 0) {
                    sb.append(Character.toString(i + 'a'));
                    sb.append(Integer.toString(hash[i]));
                }
            }
            
            List<String> l = map.getOrDefault(sb.toString(), new ArrayList<>());
            l.add(str);
            map.put(sb.toString(), l);
        }
        
        return new ArrayList(map.values());
    }
}