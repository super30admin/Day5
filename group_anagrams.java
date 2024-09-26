class Solution {
    // idea is to sort each string and use hashmap to store all elements with same sorted value in arraylist 
    // this way we can group all anagrams into single groups
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0) {
           return new ArrayList<>();
       }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
}
}