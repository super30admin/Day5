// Time Complexity: O(m*nlogn) where m is the length of strs array and n is the length of each string in the array, nlogn for sorting each
// string in the strs array.
// Space Complexity: O(m): Length of strs array


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();

        // Creating a hashmap to store values of strings
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){

            char[] chars = str.toCharArray();
            // sort the string to so that we can find an equivalent string to insert in hashmap.
            Arrays.sort(chars);
            String word = String.valueOf(chars);

            if(!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }

            map.get(word).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
