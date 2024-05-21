// Time Complexity : O(nklogk) => Assuming k is the length of each word in the string and to sort it takes klogk time, then to sort n elements, it will take O(nklogk)
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Take a hashmap with key as the sorted string and values will be list of string which matches with the key after sorting.
If key(sorted string) exists in the hashmap, simply add the original(unsorted) string as the value. If key doesn't exist, add the key and initialize empty array list as value
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> anagramMap = new HashMap<>(); //Key will be the sorted string, value will be list of original strings

        for(int i =0; i < strs.length; i++){
            String str = strs[i];
            char[] strToCharArray = str.toCharArray();
            Arrays.sort(strToCharArray);
            String sortedString = String.valueOf(strToCharArray);

            //Check if key is present, if not add the key and initialize the value as empty list
            if(!anagramMap.containsKey(sortedString)){
                anagramMap.put(sortedString, new ArrayList<>());
            }
            anagramMap.get(sortedString).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}