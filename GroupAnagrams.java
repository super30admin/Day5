// Time Complexity: O(n*k) where n is number of strings in array and k is an average length of each string.
// Space Complecity: O(n) for the map used, a constant space of (26) is reused for each word and another O(n) for the returned new Array List = O(2n) = O(n).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : faced challenges in how to implement the solution

// Your code here along with comments explaining your approach
// Naive approach taken was to make a new array with all the strings being sorted, then inserting sorted string as key and all the anagrams present on those position in actual array as list of values, returned List of values --> sorting took klogk and traversal of all strings is O(n) --> O(nklog(k))
// In order to eliminate the requirement of sorting, for each string we can use a fixed array of size 26 holding all characters as index a-z, for each string whichever character are present we increase the count and finally the count character array is converted to string.
// Finally performing same operation of taking that string as key and all anagrams as list of values, we return values of map
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultant = new HashMap<>();
        char[] count = new char[26];
        for(int i=0; i< strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            for(int p = 0; p< count.length; p++){
                count[p] = 0;
            }
            for(char c: cArr){
                count[c-'a']++;
            }
            String key = new String(count);
            if(!resultant.containsKey(key)) {
                resultant.put(key, new ArrayList<>());
            }
            resultant.get(key).add(strs[i]);
        }
        return new ArrayList<>(resultant.values());
    }
}