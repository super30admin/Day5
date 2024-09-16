class Solution {
    // Time Comlexity : O(n*l) (n is length of array, l is length of each string)
    // Space Complexity : O(n)
    private static final int[] PRIMES = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> mp = new HashMap<>();
        for(String st:strs) {
            int count = 1;
            for(int i=0; i<st.length(); i++) {
                count *= PRIMES[st.charAt(i) - 'a'];
            }
            List<String> val = mp.getOrDefault(count,new ArrayList<String>());
            val.add(st);
            mp.put(count, val);
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(Map.Entry<Integer, List<String>> entry: mp.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }
}