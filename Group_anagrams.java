class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hmap = new HashMap<>();
        
        for(String str: strs)
        {
            char[] c = str.toCharArray();
            
            Arrays.sort(c);
            String sortedWord = new String(c);
            if(!hmap.containsKey(sortedWord))
            {
                hmap.put(sortedWord, new ArrayList<>());
            }
            hmap.get(sortedWord).add(str);
            
        }
        
        return new ArrayList<>(hmap.values());
        
    }
}

// TC- O(N*KlogK)- N is the length of strs and KlogK is the time complexity to sort each of the string in strs
// SC- O(N*K) - since we use hashmap to store all the strs and the maximum length of each string is K.

/*Logic-
- Loop through strs
- For each of the word in strs, convert to char array, sort the char array
- convert the sorted char array in string and use this as a key for hashmap
- add all the original strings as values to the hashmap for sortedWord key
- return an ArrayList using all values in the hashmap
*/
