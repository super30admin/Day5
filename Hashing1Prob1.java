// Time Complexity : O(n *mlogm ) where n is length of string array and m is avg length of each string
// Space Complexity : O(n) where n is length of string array 
// Did this code successfully run on Leetcode : yes


// approach : I'm sorting each word and checking it as a key in hashmap.Took hashmap and stored sorted those keys and corresponding words 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length ==0)
            return null;
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);
            
            String keyString = String.valueOf(key);
            if(!map.containsKey(keyString)){
                map.put(keyString,new ArrayList<String>());
                
            }
            
            map.get(keyString).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}