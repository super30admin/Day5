//Time Complexity: O(N K log K), where N is the length of strs, and K is the maximum length of a string in strs. 
//The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(K log K) time.
//Space Complexity: O(N K), the total information content stored in ans.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());   
    }
}