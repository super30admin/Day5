// TC : O(n)
// SC: O(n)


// Leetcode Run : yes

//  leetcode URL : https://leetcode.com/problems/group-anagrams/


class Solution {
  public List<List<String>> groupAnagrams(String[] arr) {
    HashMap<String, List<String>> map = new HashMap<>();
    for(int i=0; i<arr.length; i++) {
      char[] tmp = arr[i].toCharArray();
      Arrays.sort(tmp);
      String s1 = new String(tmp);
      if(map.containsKey(s1)){
        map.get(s1).add(arr[i]);
      }else{
        map.put(s1,new ArrayList<>());
        map.get(s1).add(arr[i]);
      }
    }
    return new ArrayList<>(map.values());

  }

}