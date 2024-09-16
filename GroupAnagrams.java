// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map =new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray(); //convert string to character array
            Arrays.sort(c);//sort the characters
            String key = String.valueOf(c);//convert back to string
            if(!map.containsKey(key)){//then store in map
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }return new ArrayList<>(map.values());
    }
}
