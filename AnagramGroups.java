// Time Complexity : 
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String,List<String>> map = new HashMap<>();
       for(int i = 0; i < strs.length; i++){
           char[] c = strs[i].toCharArray();
           Arrays.sort(c);
           String sortedWord = String.valueOf(c);
           if(!map.containsKey(sortedWord)){
               map.put(sortedWord, new ArrayList<String>());
           }
           map.get(sortedWord).add(strs[i]);
       }
       return new ArrayList<List<String>>(map.values());
   }
}