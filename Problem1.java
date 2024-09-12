// Want to utilize the anagram property
// Same characters but different strings

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> anagrams = new HashMap<String, List<String>>();
        
        // ["eat", "tea", "tan", "ate", "nat", "bat"]
        for(int i = 0; i < strs.length; i++) {
           
            String originalWord = strs[i];
            // "eat"  
            char[] letters = originalWord.toCharArray();
            // ["e", "a", "t"]
            Arrays.sort(letters);
            // ["a", "e", "t"]
            String sortedWord = new String(letters);
            // "aet"
            
            if(anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(originalWord);
            } else {
                List<String> x = new ArrayList<>();
                x.add(originalWord);
                anagrams.put(sortedWord, x);
            }
        }
        
        List<List<String>> result = new LinkedList<>();
        
        for(String s : anagrams.keySet()) {
            
            result.add(anagrams.get(s));
        }
        
        return result;
    }
}