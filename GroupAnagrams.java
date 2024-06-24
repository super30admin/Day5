import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedTemp = String.valueOf(temp);

            if (!map.containsKey(sortedTemp))
                map.put(sortedTemp, new ArrayList<>());
            map.get(sortedTemp).add(strs[i]);

        }
        return new ArrayList<>(map.values());

    }
}