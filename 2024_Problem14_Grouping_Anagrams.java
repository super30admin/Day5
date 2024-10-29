//49. Group Anagrams - https://leetcode.com/problems/group-anagrams/

//Time Complexity: O(n * k) -> where n -> number of strings in the input * length of each string
//Space Complexity: O(1)
//Prime Product Solution




//Time Complexity: O(n) * (klog(k) + O(k))
//Space Complexity: O(1)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            //char to String: to sort characters of each string of the list
            char[] charArr = s.toCharArray();

            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}