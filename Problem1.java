// Time Complexity - O(n*klogk)
// Space Complexity - O(k*n)
// This solution worked on LeetCode
// In this problem, we are using hashmap to store the sorted order of the string as key and the string as values, So all the anagrams will have same key which is the sorted form of that string. We finally return the values of all the keys which will be List of anagrams. 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0) return new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
