import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    /*
     * Time Complexity - O(nk) where n is the length of strs array 
     * and k is the maximum length of any string in array
     * Space Complexity - O(n)
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            String key = buildKey(s);
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private String buildKey(String str) {
        StringBuilder temp = new StringBuilder("");
        int[] arr = new int[26];
        for (char c: str.toCharArray()) {
            arr[c-'a']++;
        }
        for (int i=0; i<26; i++) {
            temp.append("#");
            temp.append(arr[i]);
        }
        return temp.toString();
    }
}