// Time Complexity : O(n)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Took longer time to think of solution



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