/* Approach: consider a hashmap with string as the key and value as list of strings
sort the extracted character Array first input strs
TIme complexity: O(nk log n) - n strings in input strs, avg length of each string is k
Space complexity: O(1)
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0;i < strs.length; i++){
            String s = strs[i]; // extract first string from input

            char[] charArray = s.toCharArray(); // character Array on first string from input strs
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
