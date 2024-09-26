//Time complexity: O(N K logK), because we are iterating over array on size N and
//considering the length of string as K and sorting the string which gives K logK.
//Space complexity: O(N K)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if the array of string is empty or length of the array is 0, return empty list.
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        //create a map with sorted string as key and the value will be its anagrams present in the input array.
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            //convert the string to character array.
            char[] ch = s.toCharArray();
            //then we will sort the character array
            Arrays.sort(ch);
            //Once it is sorted, we will convert the sorted array to string.
            String key = String.valueOf(ch);
            //if the map does not contain the sorted string as key, then we will
            //add the sorted string as key in the map and empty arraylist as the value.
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        } 
        return new ArrayList<>(map.values());
    }
}