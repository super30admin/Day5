import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (int i=0;i<strs.length;i++) {

            char[] key = strs[i].toCharArray();

            Arrays.sort(key);

            String keyStr = String.valueOf(key);

            if (!map.containsKey(keyStr)) 
                map.put(keyStr, new ArrayList<>());

            map.get(keyStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
