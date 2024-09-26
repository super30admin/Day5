// Time Complexity : best case - O(Nklogk) - klogk for sorting each string and N is the array length
// Space Complexity : O(N)  - As we considered a HashMap 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    //used a hashmap to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
       
       if(strs.length == 0) return new ArrayList();
        
        HashMap<String,List> map1 = new HashMap<>();
        for(String s1 : strs){
            char[] c1 = s1.toCharArray();
            Arrays.sort(c1);
            String key = String.valueOf(c1);
            //If the string is not present 
            if(!map1.containsKey(key)){
                map1.put(key,new ArrayList());
            }
            //If the string is present then add the existing anagram to the list associated with the string
                map1.get(key).add(s1);
        }
        return new ArrayList(map1.values());
    }
}