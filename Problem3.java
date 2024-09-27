
// Leetcode 49 - Group Anagrams
// Time complexity = O(n)
// Space complexity = O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> hashmap= new HashMap();
        
        for(int i=0; i<strs.length; i++){
            
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            
            String tempString = new String(temp);
            
            if(! hashmap.containsKey(tempString)){
                hashmap.put(tempString, new ArrayList<String>());
            }
            hashmap.get(tempString).add(strs[i]);
        }
        
        return new ArrayList(hashmap.values());
    }
}