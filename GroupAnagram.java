/** Leet Code Problem 49
    Group Anagrams
    Language Used : Java
    Link: https://leetcode.com/problems/group-anagrams/
    Runtime: 6 ms, faster than 78.59% of Java online submissions for Group Anagrams.
	Memory Usage: 41.8 MB, less than 83.88% of Java online submissions for Group Anagrams.

Explaination:

 Data Structures Used : 1 hashmap, 1 char Array

 */
 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	// Edge Case if the string is empty or null we return an empty list
        if(strs==null || strs.length ==0) return new ArrayList<>();
        // Declare a hashMap named hasher
        HashMap<String, List<String>> hasher = new HashMap<>();
        // Loop through the strings 
        // Sort the string
        // Add to hash as new arrayList if it doesnot exist in hashmap
        // If it exist add the array
        for(String s:strs){
            char[] characterArray = s.toCharArray();
            Arrays.sort(characterArray);
            String sortedString = String.valueOf(characterArray);
            if(!hasher.containsKey(sortedString)){
                // Declare/Assign string to hashMap
                hasher.put(sortedString, new ArrayList<>());
            }
            //Add element to the hashMap using sortedString as key
            hasher.get(sortedString).add(s);
        }
        //Return the Array
        return new ArrayList<>(hasher.values());        
    }
}
