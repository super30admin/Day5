// Time Complexity :o(k log k)
// Space Complexity :
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :hard to get the optimal solution for this.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            char charArray[]= s.toCharArray();
            Arrays.sort(charArray);
            String sorted= String.valueOf(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
