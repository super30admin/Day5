// Time Complexity : nklog(k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*Explaination: 
1. each element of string is converted to array of chars, sorted then
converted back to string and looked up in the keys of hashmap.
2. if key exists, then the orginal string is just added to the list of strings as value of key.
3. else, new list is created and then the original string is added to it
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if(strs == null || strs.length == 0) return new ArrayList<>();;
        HashMap<String, List<String>> h = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedWord = String.valueOf(c);
            if(h.get(sortedWord) == null){
                h.put(sortedWord, new ArrayList<String>());
            }
            h.get(sortedWord).add(strs[i]);
        }
        return new ArrayList<List<String>>(h.values()); 
    }
}