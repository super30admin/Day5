// Time Complexity : O(n * klogk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach in three sentences only
// Sort each string in list and use it as a key
// add each string with sam key(after sorting each string) to hash map. return values of hash map

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i=0; i< strs.length; i++){
            String s = strs[i];
            char strChar[] = s.toCharArray();
            Arrays.sort(strChar);
            String sortedStr = String.valueOf(strChar);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}