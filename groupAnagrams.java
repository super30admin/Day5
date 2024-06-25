/*
Time Complexity --> O(n*mlogm)
Space Complexity --> O(n) for newList, O(n) for hashmap
 */
import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> data = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String val = new String(charArray);
            List<String> list = data.getOrDefault(val, new ArrayList<>());
            list.add(strs[i]);
            data.put(val, list);

        }//for
        //System.out.print(data);

        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            List<String> values = entry.getValue();
            List<String> list = new ArrayList<>();
            for (String v : values) {
                list.add(v);

            }
            if (list.size() > 0) {
                res.add(list);
            }
        }//for

        return res;

    }
}
