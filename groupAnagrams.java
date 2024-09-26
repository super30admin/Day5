// Time Complexity: O(n*slog(s))  where n is number of strings and s is the length of strings
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<char[], List<String>> map = new HashMap<>();
        for(String str: strs)
        {
            char[] cArr=str.toCharArray();
            Arrays.sort(cArr);
            if(!map.containsKey(cArr))
            {
                map.put(cArr, new ArrayList());
            }
            map.get(cArr).add(str);

        }

        for(Map.Entry<char[], List<String>> entry: map.entrySet())
        {
            result.add(entry.getValue());
        }

        return result;
    }
}