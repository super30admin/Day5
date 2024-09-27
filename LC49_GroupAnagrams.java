//LC 49 Group Anagrams

// Sorted the strings to compare it with the original string and store it in the same list
// Time Complexity: O(nklogk), where n is the length of strs, and k is the maximum length of a string in strs
// Space Complexity: O(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = String.valueOf(strArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}