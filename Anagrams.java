// Time Complexity : O(nk)
// Space Complexity :O(nk)
class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charc = new char[26];
            for (char c : s.toCharArray())
                charc[c - 'a']++;

            String keystring = String.valueOf(charc);
            if (!map.containsKey(keystring))
                map.put(keystring, new ArrayList<>());

            map.get(keystring).add(s);

        }
        return new ArrayList<>(map.values());

    }
}