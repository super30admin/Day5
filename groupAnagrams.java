//Time complexity is o(n*m) and space complexity is o(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap();
        for (String str : strs) {
            char[] characters = new char[26];
            for (char eachChar : str.toCharArray())
                characters[eachChar - 'a']++;
            String keystr = String.valueOf(characters);
            if (!map.containsKey(keystr))
                map.put(keystr, new ArrayList<>());
            map.get(keystr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}