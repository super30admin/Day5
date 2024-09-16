//tc O(n)
//sc O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hashmap = new HashMap<>();
        
        
        
        
        for(String str: strs){
            
            // this is our key
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            
            // add to hashmap
            
            if(!hashmap.containsKey(sortedString)){
                hashmap.put(sortedString, new ArrayList<String>());
            }
            hashmap.get(sortedString).add(str);  // intuitively arraylist add
        }
        
        return new ArrayList<>(hashmap.values());
        
        
        
    }
}