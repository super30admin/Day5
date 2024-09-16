// Time Complexity : O(NKlogK), where NN is the length of strs, and KK is the maximum length of a string in strs
// Space Complexity : O(N*K)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String newStr = new String(chArr);
            if (!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<String>());
            }
            map.get(newStr).add(str);
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}