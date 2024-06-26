// Time Complexity : O(nklog k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> hashmap = new HashMap<>();
    for(String s : strs) {
      // Sorting each string by converting it into a character array, sorting that array and converting it back to a string.
      char[] sChar = s.toCharArray();
      Arrays.sort(sChar);
      String newS = new String(sChar);
      // Checking if the hashmap contains the sorted string as a key or not.
      if(hashmap.containsKey(newS)){
        hashmap.get(newS).add(s);
      }else{
        hashmap.computeIfAbsent(newS, k-> new ArrayList<>()).add(s);
      }
    }
    return new ArrayList(hashmap.values());
  }
}