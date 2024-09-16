// Time Complexity : O(nklog(k)) - where k is avg length of each string and n is length of input string array
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class GroupedAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String s: strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String key = new String(sArray);
            
            if(!anagramMap.containsKey(key)){
                anagramMap.put(key, new ArrayList<String>());
            }
            anagramMap.get(key).add(s);
        }
        
        result.addAll(anagramMap.values());
        return result;
    }
}
