// Time Complexity : The time complexity is O(nk) where n is the length of the array and k is the length of maximum string.
// Space Complexity : The space complexity is O(nk) since all the string are stored in the map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int[] hash = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        List<List<String>> output = new LinkedList<>();

        Map<Long,List> map = new HashMap<>();

        for(String s:strs){

            long count = 1;

            //Traverse through the length of string to get the hash of the string
            for(int i=0;i<s.length();i++){
                count *= hash[s.charAt(i) - 'a'];
            }

            // Add the string in map based on the key
            if(!map.containsKey(count)){
                map.put(count,new LinkedList<>());
            }

            map.get(count).add(s);

        }

        // Traverse through the map to add the Lists to the output
        for(long each:map.keySet()){

            output.add(map.get(each));

        }

        return output;

    }
}