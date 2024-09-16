/*
Author: Akhilesh Borgaonkar
Problem: Given an array of strings, group anagrams together.
Approach: Using hashing technique here to store the sorted sequence of strings in input array. Get the strings from strs[] - convert it to char array
    - sort it alphabetically - then store in hashmap such that ordered sequence is key and original strings is in value viz. arraylist.
Time Complexity: O(n*mlogm) where n is length of string array strs[] and m is average length of a string in strs[].
Space complexity: O(n) where n is number of strings in strs[].
LC Verified.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();       //convert string to character array
            Arrays.sort(chars);                         //sort the literals
            String key=String.valueOf(chars);           //get sorted string
            
            if (!map.containsKey(key))                  //if the sorted string is not present already in hashmap then create an empty list
                map.put(key, new ArrayList<String>());
            map.get(key).add(strs[i]);                  //add the original string to the value arrayList
        }
        
        return new ArrayList<List<String>>(map.values());   //return list of all values viz. array lists.
    }
}
