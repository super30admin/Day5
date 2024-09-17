// Time Complexity :O(n)
// Space Complexity :O(n) - number of strings
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :calculating time complexity

// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] eachString=s.toCharArray();
            Arrays.sort(eachString);
            String key=String.valueOf(eachString);
            if(!map.containsKey(key))
                map.put(key,new ArrayList());
            map.get(key).add(s);
        }
        
        return new ArrayList(map.values());
    }
}