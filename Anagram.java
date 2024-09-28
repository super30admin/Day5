// Time Complexity : klogk * N where k is the avg lenght of all hte strings in the input array and N is the lenght of the strings in the input array
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Using sorting

        HashMap <String, List<String>> anaMap = new HashMap<>();
        int len = strs.length;

        for (String s: strs) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sorted = String.valueOf(sArray);

            // check if key is present in the hashmap or not
            if(!anaMap.containsKey(sorted)) {
                anaMap.put(sorted, new ArrayList<String>());
            }
            List<String> sToAdd = anaMap.get(sorted);
            sToAdd.add(s);
            anaMap.put(sorted, sToAdd);
        }

        return new ArrayList<>(anaMap.values());

    }
}