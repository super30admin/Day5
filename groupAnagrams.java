// Time Complexity : O(N*K)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
1. We are maintaining a Hashmap of arraylist. 
2. We take each string and sort them alphabetically in order
3. We use this sorted word as key of out hashtable and add the unsorted string in the arraylist
4. in the end we return all the arraylist
*/

// Solution:

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<String, List<String>>();
        List<List<String>> finalArray = new ArrayList<List<String>>();
        for(String str: strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = new String(strArray);
            
            if(anagram.containsKey(sortedString)) {
                anagram.get(sortedString).add(str);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(str);
                anagram.put(sortedString, temp);
            }
        }
        
        finalArray.addAll(anagram.values());
        return finalArray;
    }
}
