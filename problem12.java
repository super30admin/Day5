// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

//Given array of strings, group anagrams together
// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    Map<String,List<String>> map= new HashMap<>();
        
        
        for(String S : strs){
            
            char[] CharArr=S.toCharArray();
            Arrays.sort(CharArr);
            
            String sortedStr = String.valueOf(CharArr);
            
            if(!map.containsKey(sortedStr)){
                
                map.put(sortedStr,new ArrayList<>());
            }
            
            map.get(sortedStr).add(S);
        }
       return new ArrayList<>(map.values()); 
    }
}
