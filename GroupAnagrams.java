// Time Complexity: O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
             
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) 
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}