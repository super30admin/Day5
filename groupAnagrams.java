// Time Complexity : O(NKLogN) Use of hashmap and arrays sorting
// Space Complexity : O(NK) USe of hashmap and length of input array (K)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve the problem before class. Need to practice the optimised version of this using prime numbers.


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return new ArrayList();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word: strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            if(!map.containsKey(sorted)) map.put(sorted, new ArrayList<String>());
            map.get(sorted).add(word);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}
