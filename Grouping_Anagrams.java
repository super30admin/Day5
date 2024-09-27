// Time Complexity : O(n)*O(nlogn) + O(n) which will be O(n^2logn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, at first I referenced this solution as it was my first hashing question.


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap(); 
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> s = map.getOrDefault(key, new ArrayList());
            s.add(str);
            map.put(key,s);
        }
        List<List<String>> result = new ArrayList();
        map.forEach((key,value)->{
            result.add(value);
        });
        return result;
    }
}