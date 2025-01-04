//TC: O(nk logn)
//SC: O(nk)
//approach: sort strings and put strings with same sorted value in hashmap under same key
// return hashmap key values as result

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            anagramMap.putIfAbsent(sorted, new ArrayList<>());
            anagramMap.get(sorted).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}

