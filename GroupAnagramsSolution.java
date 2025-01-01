class GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);

            if (!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}