// Time Complexity: O(NLogN)
// Space Complexity: O(N)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        for(String tmp: strs){
            char[] tmpChar = tmp.toCharArray();
            Arrays.sort(tmpChar);
            String sortedString = String.valueOf(tmpChar);
            if(!map.containsKey(sortedString)) map.put(sortedString, new ArrayList<String>());
            map.get(sortedString).add(tmp);
        }
        return new ArrayList<>(map.values());        
    }
}
