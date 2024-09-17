// Time Complexity : O(n*m) where n -> length of strs, m -> length of longest string in strs
// Space Complexity : O(n*m) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.fill(count,0);
            
            // Instead of sorting which increases the time complexity to O(n*m logn)
            // I used array converted to string as Key
            
            for(char c:ch)
                count[c-'a']++;
            String str = Arrays.toString(count);
            if(!map.containsKey(str))
                map.put(str,new ArrayList<String>());
            map.get(str).add(s);
        }
        for(List<String> list:map.values())
            result.add(list);
        return result;
    }
}
