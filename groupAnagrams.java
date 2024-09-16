// Time Complexity : O(n*m*logm)
// Space Complexity : O(N + K) //for hashmap?
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //for the base case we check if the array is empty
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        //we loop through the array of strings
        for(String s: strs){
            //we change the string at hand to an array of characters
            char[] ch = s.toCharArray();
            //we sort the characters of the string into alphabetical order
            Arrays.sort(ch);
            //returns the string representation of the characters
            String key = String.valueOf(ch);
            //if there is no key that already exists with the same characters then we create a new one
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            //either the key already existed or we just made one above so we place the string over there
            map.get(key).add(s);
        }
            
        return new ArrayList<>(map.values());
    }
}