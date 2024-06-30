//Time Complexity: O(N * log k))
//Space Complexity: O(N * k)

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.containsKey(str)) {
                map.get(str).add(s);
            }
            else {
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                map.put(str,al);
            }

        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;

    }
}