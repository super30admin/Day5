class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new LinkedHashMap<>();
        char arr[];

        for(int i=0; i<strs.length; i++) {
            arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String keyString = String.valueOf(arr);
            if(!map.containsKey(keyString)) {
                map.put(keyString, new ArrayList<>());
            }
            map.get(keyString).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}