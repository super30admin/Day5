// Time Complexity : O(nk logk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){ // n
            char[] sArr = str.toCharArray();
            Arrays.sort(sArr); //k logk
            String sorted = String.valueOf(sArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        } //nk logk
        return new ArrayList<>(map.values()); // O(n)
    } // total time = nk logk
}