import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity : O(2n log n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.

class anagrams {
    public List<List<String>> groupAnagrams(String [] strs){
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedArr = new String(chars);
            List<String> list = hashMap.getOrDefault(sortedArr, new ArrayList<>());
            list.add(s);
            hashMap.put(sortedArr, list);

        }

        for(Map.Entry<String, List<String>> entry: hashMap.entrySet()) {
            result.add(entry.getValue());
        }

        return result;

    }  
}