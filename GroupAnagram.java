// Time Complexity : O(nk) where n is length of string array and k is the max length of string in that array os tring 
// Space Complexity : O(nk)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            int[] count = new int[26];

            for (char c : chars) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = groupAnagrams(strs);

        for (List<String> r : res) {
            System.out.println(r.toString());
        }
    }
}