//Time complexity:O(nk) n-> number of strings, k->length of string 
//Space Complexety:O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> map = new HashMap<>();
      for(String s : strs){
          char[] count = new char[26];
          for(char c : s.toCharArray()){
              count[c - 'a']++;
          }
          String keystr=String.valueOf(count);
          if(!map.containsKey(keystr)){
              map.put(keystr,new ArrayList());
          }
          map.get(keystr).add(s);
      }
        return new ArrayList(map.values());
  }
}