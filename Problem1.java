import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// time complexity O nklogk
// space complexity o (n * k)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray); //klogk
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

}