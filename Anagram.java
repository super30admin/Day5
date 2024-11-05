// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, List<String>> map = new HashMap<>();

            for(String word: strs){

                char[] temp = word.toCharArray();
                Arrays.sort(temp);
                String sortedStr = String.valueOf(temp);

                if(!map.containsKey(sortedStr)){
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(word);
            }
        return new ArrayList<>(map.values());
    }
}