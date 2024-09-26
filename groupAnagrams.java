// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {

     int[] primeArray = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public List<List<String>> groupAnagrams(String[] strs) {

         if(strs == null || strs.length == 0)
            return new ArrayList<>();

       Map<Long, ArrayList<String>> map = new HashMap<Long, ArrayList<String>>();
        for (String str : strs) {
            long key = getAsciiValue(str);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

    public long getAsciiValue(String str) {
        long ret = 1;
        for(char c : str.toCharArray()) {
            int val = c;
            ret *= (primeArray[val - 'a']);
        }
        return ret;

    }

}
