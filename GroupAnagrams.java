//Time Complexity: O(N)
// Space Complexity: O(NK), where K is avg length of words
//Runtime: 9 ms, faster than 39.11% of Java online submissions for Group Anagrams.
//Memory Usage: 53.2 MB, less than 5.19% of Java online submissions for Group Anagrams.
// No issues

class Solution {
     
    private static final int[] PRIMES = new int[]{ 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            int primeProduct = -1;
            for (int j = 0, max = strs[i].length(); j < max; j++) {
                primeProduct *= PRIMES[strs[i].charAt(j) - 'a'];
            }
            List<String> words = map.get(primeProduct);
            if (words == null) {
                words = new ArrayList<>();
                map.put(primeProduct, words);
            }
            words.add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}


