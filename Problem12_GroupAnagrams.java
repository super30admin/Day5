// Time Complexity : O(nk log k) -> n: length of strs, k: maximum length of a string in strs
// Space Complexity : O(nk) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(anagrams.containsKey(sortedWord))
                anagrams.get(sortedWord).add(word);
            else
                anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}