/**
Problem: Group anagrams together

Time Complexity: O(n * klogk), where n is the number of words, and k is the length of each word
Space Complexity: O(n * k), as we use additional HashMap; where n is the number of words, k is the length of each word
Did this code successfully run on Leetcode : Yes

Approach : Use HashMap
1. First sort each word.
2. Make use of a hashmap, where this sorted word acts as key.
3. This way, we add only one unique key(sorted word) to the hashmap, and as its value we keep appending words which have a similar sorted word.
4. The values are nothing but the list of words, which are anagrams grouped together.

*/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>(); //initialize hashmap
        for(int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray); //sort every word
            String sortedString = String.valueOf(charArray);
            if(!hm.containsKey(sortedString)) 
                hm.put(sortedString, new ArrayList<String>());
            hm.get(sortedString).add(strs[i]); //put sorted word as key, and words which have same sorted word as value.
        }
        return new ArrayList<List<String>>(hm.values()); 
        
    }
}