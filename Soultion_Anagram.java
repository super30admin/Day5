/*
Time Complexity : O(NK logK) , here N is for the each string we get from strs arrays.
Klogk here k is the maximum length of the string in strs and we do sorting so total O(k logk).

Space complexity : O(nk).

*/

import java.util.*;

class Solution_Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        // creted map of value as list beacause we have to group all same anagram
        // together.
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);

            if (!map.containsKey(sorted)) {

                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);

        }

        return new ArrayList<>(map.values());

    }
}