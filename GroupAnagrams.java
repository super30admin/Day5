/*
* Time complexity - O(N) - linear scan of String array is done 
 Space Complexity - O(N) - using a hashmap as auxiliary data structure
 Ran on Leetcode 
*/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String k = String.valueOf(arr);
            if (map.get(k)==null){
                map.put(k, new ArrayList<String>());
            }
           // List<String> list = map.get(k);
            //list.add(str);
             map.get(k).add(str);
        }
        return  new ArrayList(map.values());
    }
}