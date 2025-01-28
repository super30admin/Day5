// Time Complexity : O(n * klogk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// Used hashmap store key as sorted array and values to store list of anagrams determined using the sorted key

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sMap = new HashMap<>();

        // traversing: O(n)
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr); // klogk
            String sorted = String.valueOf(charArr);
            if (!sMap.containsKey(sorted)) { //k
                sMap.put(sorted, new ArrayList<>());
            }
            sMap.get(sorted).add(s);
        }
        return new ArrayList<>(sMap.values());
    }
}
