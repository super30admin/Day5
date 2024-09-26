class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
             int[] list = new int[26];
            for(char c : str.toCharArray()) {
                 list[c - 'a']++;
                
            }
            if(!map.containsKey(Arrays.toString(list))) {
                map.put(Arrays.toString(list), new ArrayList<>());
            }
            List<String> l = map.get(Arrays.toString(list));
            l.add( str);
        }
        for(List<String> g : map.values()) {
            group.add(g);
        }
        return group;
    }
}