// Find out the anagrams
// used hashmap to host the lists which will become the result.abstract 
// The logic is that after sorting the anagrams would have the same order of characters.
// so easier to compare and get the similar strings. Place them in a hashmap and just output them.

// Time complexity = O(mnlog(n))// the sorting and the iteration of all strings in an array over it.
// Space complexity = O(n) // there can be a million words (combos can be.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String res = String.valueOf(ch);
            List<String> lst ;
            if(map.containsKey(res)) {
                lst = map.get(res);
            } else {
                lst = new ArrayList<>();
            }
            lst.add(str);
            map.put(res, lst);            
        }
        return new ArrayList<>(map.values());
    }
}