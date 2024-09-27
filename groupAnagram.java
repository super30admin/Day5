// Time Complexity :O(logm)+O(n) where m is length of string to be sorted and n is length of string array
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a hashmap to store sorted string and list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        // List<List<String>> result=new ArrayList<>();
        for (String s : strs) {// iterating through strings
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);// sort string making it char array
            String sortedString = String.valueOf(charArr);// make it a string
            if (!map.containsKey(sortedString)) {// if map doesn't contain anagram, add sorted string and make new
                                                 // arraylist
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(sortedString, temp);
            } else {
                // else add in anagram list inside hashmap
                map.get(sortedString).add(s);
            }
        }
        // return all values of hashMap
        return new ArrayList(map.values());
    }
}