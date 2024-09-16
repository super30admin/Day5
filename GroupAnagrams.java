import java.util.ArrayList;
//https://leetcode.com/problems/group-anagrams/
/*
Time: O(N) where N = number of words in the input strs array
Space: O(N) for HashMap + O(N) for freq arrays
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        if (strs.length == 0 || strs == null)
            return new ArrayList<>();

        for (String str : strs) {
            char[] freq = new char[26];

            int n = str.length();

            for (int i = 0; i < n; i++) {
                freq[str.charAt(i) - 'a']++;
            }
            String key = String.valueOf(freq);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<String>());

            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());
    }

}
