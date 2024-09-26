//time complexity: O(nklog k), n is num of strings, k is length of string
//space complexity:O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s:strs) {
            String sorted = sortString(s);
            
            // if map does not contain sorted string key
            //create a new list 
            if(!map.containsKey((sorted))) {
                map.put(sorted, new ArrayList<>());
            }
            
            //else add s to the key that is already present
            map.get(sorted).add(s);
        }
        
        //return the values in the list form
        return new ArrayList<>(map.values());
    }
    
    
    //sort takes klogk time
    private String sortString(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        return String.valueOf(charArr);
    }
}