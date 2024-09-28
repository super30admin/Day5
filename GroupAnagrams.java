
// Time Complexity : O(nk) - k is the length of String
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :YES  
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Long, List<String>> map = new HashMap<Long, List<String>>();

        for (String s : strs) {
            long val = getPrimeValue(s);

            if (!map.containsKey(val)) {
                map.put(val, new ArrayList<String>());
            }

            map.get(val).add(s);

        }

        return new ArrayList<List<String>>(map.values());

    }

    public long getPrimeValue(String str) {
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };
        long ans = 1;
        for (Character c : str.toCharArray()) {
            ans = ans * prime[c - 'a'];
        }

        return ans;
    }
}
