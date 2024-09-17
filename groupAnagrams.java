import java.util.*;
class groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            int[] counts = new int[26];
            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i : counts) {
                sb.append(i);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(word);
        }
        return new ArrayList(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for (List<String> list : groupAnagrams(strs)) {
            System.out.println(list);
        }
    }
}