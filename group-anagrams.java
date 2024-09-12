import java.util.*;

//time complexity is O(nklogk) where k is the average length of the word
//memory complexity is O(n) -> number of words
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] charArray = word.toCharArray(); // we convert so we can sort because that is how we sort strings
            Arrays.sort(charArray);
            // then we convert it back to string
            String sorted_string = String.valueOf(charArray);

            if (!map.containsKey(sorted_string)) {
                map.put(sorted_string, new ArrayList<>());
            }

            map.get(sorted_string).add(word);

        }

        // now we have our whole hashmap built

        return new ArrayList<>(map.values());
    }
}