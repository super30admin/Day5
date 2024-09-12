// Time Complexity : O(nk) where n is the length of the strings array and k is the length of the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * In this solution, we calculate the string hash value based on the count of the individual characters in each of the string
 * for each of the strings, we calculat the hash key and store in the hashmap at the correct key
 * Finally we construct the result list and return the list.
**/

class Solution {
    
    // This method will return the string hash key for a string as input
    private String hash_fun(String str) {
        
        int[] char_count = new int[26];
        
        for(int i=0;i<str.length();i++) {
            char_count[str.charAt(i) - 'a']++;
        }
        
        // construct the string hash
        StringBuilder sb  = new StringBuilder("");
        
        for(int j=0;j<26;j++) {
            sb.append("|");
            sb.append(char_count[j]);
        }
        
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hmap = new HashMap<>();
        
        for (int i=0;i<strs.length;i++) {
            String hash = hash_fun(strs[i]);
            
            if(hmap.isEmpty() || !hmap.containsKey(hash)) {
                // hashmap does not contain the hash key or it is empty
                
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                
                hmap.put(hash, list);
            } else {
                // hashmap already contains the hash key
                hmap.get(hash).add(strs[i]);
            }
        }
        
        // construct the Result
        List<List<String>> result = new ArrayList<List<String>>();
        
        for(Map.Entry<String, List<String>> entry: hmap.entrySet()) {
            result.add(entry.getValue());
        }
        
        return result;
    }
}