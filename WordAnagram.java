//Time Complexity  O(N)
// Space complexity O(1)
class Solution {
    private int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
            97, 101 };

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String s : strs) {
            double key = getKey(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double getKey(String s) {
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result *= primes[ch - 'a'];
        }
        return result;
    }
}