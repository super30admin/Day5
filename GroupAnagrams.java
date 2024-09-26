// Time Complexity : O(N*C), #strings * avg char length
// Space Complexity : O (N*C)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// getHash of string by calculating char counts, form fixed length hash string
// now just process each word and keep in bucket, return all buckets

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs==null || strs.length==0)
            return new ArrayList<List<String>>();
        
        //initialize hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        
        //for each string, sort chars in string and put in hashmap entry
        for(String word : strs){
            
            String key = getHash(word);

            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            
            map.get(key).add(word);
        }
        
        List<List<String>> result = new ArrayList<>();
        
        //in the end return all entires in a list
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        
        return result;
    }
    
    private String getHash(String word){
        int[] counts = new int[26];
        
        for(char ch : word.toCharArray()){
            counts[ch-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int n : counts){
            sb.append(n);
            sb.append("#");
        }
        
        return sb.toString();
    }
}