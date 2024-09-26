//Time complexity  - O(N * K * logn)
//Space complexity - As we are using hashtable - O(N * K)



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        /** creating hashmap to store key as a string and set of anagrams as list of string */
        Map<String,List<String>> groupAnagrams = new HashMap<>();

        /** Traversing through the string array */
        for(String s:  strs) {

            /** converting to char array for sorting and storing as a key*/
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);

            /** if the key is not present put the key and add the string */
            groupAnagrams.putIfAbsent(key, new ArrayList<>());

            groupAnagrams.get(key).add(s);


        }

        return new ArrayList<>(groupAnagrams.values());

    }
}