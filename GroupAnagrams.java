class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}