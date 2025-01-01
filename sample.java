

//Grouping anagrams
Time Complexity O(nklogk) + Lookup Time in HashMap- O(k)
Space complexity O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groupmap = new HashMap<>();
        for (int i=0;i<strs.length;i++) {
            char[] carray = strs[i].toCharArray();
            Arrays.sort(carray);
            String sortedStr = String.valueOf(carray);
            if (!groupmap.containsKey(sortedStr)) {
                groupmap.put(sortedStr, new ArrayList<String>());
                groupmap.get(sortedStr).add(strs[i]);
            } else {
                groupmap.get(sortedStr).add(strs[i]);
            }
        }
        return new ArrayList<>(groupmap.values());
        
    }
}



