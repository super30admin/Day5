//time complexity = O(nklogn)
//space complexity = O(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* the logic is to sort the first occurance of a word, calcuate the prime product
        sort it, if it is not present in our hashmap, put the string into it */ 
        
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        
        for(String s: strs){
            //splitting the string into char array before sorting the letters in the string
            
            char[] characterArray = s.toCharArray();
            Arrays.sort(characterArray);
            String sortedString = String.valueOf(characterArray); //forming a string back after sorting
            
            if(!anagramMap.containsKey(sortedString)){
                anagramMap.put(sortedString, new ArrayList<>());
            }
            
            anagramMap.get(sortedString).add(s); 
            
            
            
        }
        
        return new ArrayList<>(anagramMap.values());
    }
}