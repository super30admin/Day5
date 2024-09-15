// Time Complexity : O(n*mlogm)
// Space Complexity : O(nm)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Anagrams are words that contain same characters. To leverage this property, I am sorting each word and adding it as key in my map. On sorting each word, anagrams such as 'eat' or 'tea' will represent same sorted value. 
// In my map, I'll check for this key (sorted word) and add the original word in the list.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // result list
        List<List<String>> result = new ArrayList<List<String>>();
        
        //edge case
        if(strs == null || strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap();
        
        //Iterating over the string array
        for(String str : strs) {
            // converting the current string to character array and sorting it
            char[] currWord = str.toCharArray();
            Arrays.sort(currWord); 
            String chkVal = String.valueOf(currWord);
            // adding the anagrams in the map
            if(!map.containsKey(chkVal)) {
                map.put(chkVal, new ArrayList());
            }
            map.get(chkVal).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}


// Approach 2: Create an array of prime numbers of length 26. The indices in this array will represent the characters from 
// a-z: 'a' --> index 0; 'b' --> index1 etc.
// The product of characters in the word can be considered as key in the map and the list will be the value. The list can be generated
// in a similar fashion as was done in previous step.
// This approach will help in minimizing the time complexity to O(nm), as sorting the individual words will not be required.
// Space complexity using this approach will be O(n), as we will be storing integers as key.