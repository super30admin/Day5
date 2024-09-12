class Solution {
    // Time Complexity : O(nk), where n is length of the strs array and k is the average length of each string in the array
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    //Approach - Create a map to store prime product of the characters in the string as the key and its anagram
    // as list of values. return map.values().
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<Double, List<String>> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            double key = computePrimeValue(strs[i]);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public double computePrimeValue(String s) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        char[] ch = s.toCharArray();
        double result = 1;
        for(char c : ch) {
            result *= primes[c -'a'];
        }
        return result;
    }
}