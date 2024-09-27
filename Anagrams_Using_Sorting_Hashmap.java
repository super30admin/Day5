import java.util.*;

class Solution {
    // Solution using sorting and hashmap
    // Time complexity is O(nklogk)
    // Space complexity is O(nk)
    // Solution is submitted on leetcode with no errors
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] charArr = s.toCharArray(); // convert to char array
            Arrays.sort(charArr); // sort
            String sorted = String.valueOf(charArr); // convert to string
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}