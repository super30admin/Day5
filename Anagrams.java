/* Time Complexity : O(nmlogm)-> to sort the characters of n strings, m number of characters(max)
O(k) key parse over HashMap to get the lists to append over as the final result 
Total = O(nmlogm) + O(k) = O(nmlogm) where n is the number of strings, m is the max number of characters for a string
// Space Complexity : O(n) HashMap storing the number of sorted keys
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/*Algorithm:  Start parsing over the string array. For each string, sort the particular string and add it to the sorted_strs list.
Store the sorted string as the key and sort each of the other strings. The strings that were formed equivalent to the string that is stored 
as the key, put their original string form in sorted_strs as a list and add it to the key (key is sorted). Parse over the hashmap to get the
values that is a list and append the lists in the result (list of list()).
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<List<String>>();
    HashMap<String, List> store = new HashMap<String, List>();
    List<String> sorted_strs;                   // Keeps the original form of sorted strings corresponding to a particular sorted string as key
    for(int i = 0;i<strs.length;i++){
        char tempArray[] = strs[i].toCharArray();
        Arrays.sort(tempArray);                 // Sorting Each string
        String temp = new String(tempArray);
        if(store.get(temp) == null){
         sorted_strs = new ArrayList<>();
         sorted_strs.add(strs[i]);              // If no list is present, create one and put the required value.
         store.put(temp, sorted_strs);  
        } else {
        store.get(temp).add(strs[i]);           // add the original form of the string in the list that has sorted string of all those unsorted string as key
        }
    }

    for(String key: store.keySet()){
            result.add(store.get(key));             // Parse over the HashMap values to include them in your final result
        }
    return result;
}
}