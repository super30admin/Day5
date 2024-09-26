import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedString= String.valueOf(c);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<String>());
            }
            map.get(sortedString).add(strs[i]);
        }


        return new ArrayList<>(map.values());
    }
}
