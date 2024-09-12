class Solution {
// Get strings, convert to char array sort tem. Add them to map if not already there.
    // key will be sorted string value and value will be list of anagrams

    // Time: O(n logn)
    // Space: O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        // edge case
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> groups = new HashMap<>();

        for (String input : strs) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);
            if (groups.containsKey(key)) {
                groups.get(key).add(input);
            } else {
                List<String> list = new ArrayList<>();
                list.add(input);
                groups.put(key, list);
            }
        }

        return new ArrayList(groups.values());
    }
}
