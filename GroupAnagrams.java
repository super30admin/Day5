// Time Complexity :o(nklogk) n is no of string klogk is soring of strings
// Space Complexity :o(1) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no
 
 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for (String s : strs) {
            char [] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}