/******************** Group Anagrams ****************************/
// Time Complexity : O(logn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> output = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();

    for (String current : strs) {
      //convert the word to an array, sort it and then convert it to a string. we can compare the 2 words when the alphabets are sorted
      char[] c = current.toCharArray();
      Arrays.sort(c);
      String new_string = new String(c);
      if (!map.containsKey(new_string)) {
        map.put(new_string, new ArrayList<>());
      }
      map.get(new_string).add(current);
    }
    output.addAll(map.values());
    return output;
  }
}
