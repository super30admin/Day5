// Time Complexity: O(nc) where n is length of input array strs and c is max chars in string
// Space Complexity: O(n)
// The code ran succesfully on leetcode

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] letters = new int[26];
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
            StringBuilder sb = new StringBuilder();
            Arrays.fill(letters, 0);
            for(char c: strs[i].toCharArray()) {
                letters[c - 'a']++;
            }

            for(int j=0; j<letters.length; j++) {
                sb.append(letters[j]);
            }

            List<String> list = map.getOrDefault(sb.toString(), new ArrayList<String>());
            list.add(strs[i]);
            map.put(sb.toString(), list);
        }

        return new ArrayList<>(map.values());
    }
}