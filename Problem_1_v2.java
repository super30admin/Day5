class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        Map<String, List<String>> hashMap = new HashMap<>();
        
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);
            if(!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString, new ArrayList<>());
            }    
            
            hashMap.get(sortedString).add(word);
        }
        
        return new ArrayList<>(hashMap.values());
    }
}