// Time Complexity : o(nl logl) where l in the length of each string.
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length ==  0)
            return new ArrayList();
        
        Map<String, List> map = new HashMap<String, List>();
        for (String str: strs)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}