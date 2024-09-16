// Time Complexity : O(n*k); n = #strings, k = len of string
// Space Complexity : O(n) bcz hashmap; array would be constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();

        for (String s : strs) {
            long key = calculatePrime(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private long calculatePrime(String s) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        long key = 1;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            key = key * prime[curr - 'a'];
        }
        return key;
    }
}