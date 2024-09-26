/**
Time complexity : O(nk), where n is total number of strings and k is maximum length of string
Space Complexity : O(nk), size of hashmap
Algorithm: 1. Need to maintain a map of string and its anagrams.
           2. Iterate over each string, calulate the number of characters and create a string of counts of characters in that string.
           3. store this newly created string as a key in hashmap and a string itself as a on of value in hashmap's values list.
           4. Do this for all strings and return the values.
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList();
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for(String str : strs){
            Arrays.fill(count, 0);
            for(char c: str.toCharArray())
                count[c-'a']++;
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
