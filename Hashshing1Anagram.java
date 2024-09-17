// Time Complexity : O(nlog n)
// Space Complexity : (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution{

    public List<List<String>> groupAnagram(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}