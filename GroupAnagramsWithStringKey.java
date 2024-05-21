/**
 Approach 1: Using Hashmap {key,value} -> {sortedString, list of anagrams}

 Working: Iterating through the string array length and sorting each value in array and checking if
          it contains in the map, if yes, add the value to the corresponding list

 Time Complexity: O(n klog k)
 Space Complexity: O(1)
 */

class GroupAnagramsWithStringKey {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return new ArrayList<>(new ArrayList<>());
        }

        int l = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<l;i++) {

            String s = strs[i];

            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String sortedString = String.valueOf(chr);

            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(s);
        }


        return new ArrayList<>(map.values());
    }
}