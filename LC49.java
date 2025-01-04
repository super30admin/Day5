// TC: O(N * K(log(K))) -> where K is the average length of the string.
// SC: O(N) -> where N is the total length of the input array.

import java.util.*;

class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                map.put(sortedString, new ArrayList<String>(Arrays.asList(s)));
            }
        }

        List<List<String>> ans = new ArrayList<List<String>>();

        for (List<String> ss : map.values()) {
            ans.add(ss);
        }

        return ans;
    }
}