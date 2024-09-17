/*

Big O: Time Complexity: O(NklogK), where N is length of array, and K is the size of the strings present in array 
Space: O(Nk), where N is the number of elements in the arrayList and k is the length of each string 

Passed All Test Cases

Solution: Using HashMap, we iterate over String array, to convert each string into char array. We sort char array and insert it's string value in hashmap and use it to check for the other strings.
Also, simulatenously, we keep on adding the similar strings (equal strings) to the array List

*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case 
        if (strs.length == 0 || strs == null) return null ; 
        //hashmap to store anagrams 
        HashMap<String, List<String>> map = new HashMap<>() ; 
        
        //using for each 
        for (String st: strs) {
            //creating char array for each string 
            char [] charArray = st.toCharArray() ; 
            Arrays.sort(charArray) ; 
            String sortedWord = String.valueOf(charArray) ; 
            
            //creating the arrayList for the key 
            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<String>()) ; 
            }
            
            map.get(sortedWord).add(st) ; 
        }
        
        return new ArrayList(map.values()) ;
    }
}