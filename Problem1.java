//T: O(NK) where k is avg length of string
//S:O(N)
//Error for int and long instead of double

class Solution {
private static final int[] primes = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
   
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new LinkedList<>();
        Map<Double, List<String>> mapString = new HashMap<>();
        int result = -1;
        for (int i = 0; i < strs.length; i++){
            double mapping = 1;
            for (int j = 0, max = strs[i].length(); j < max; j++) {
                mapping *= primes[strs[i].charAt(j) - 'a'];
            }
            List<String> strings = mapString.get(mapping);
            if (strings == null) {
                strings = new LinkedList<>();
                mapString.put(mapping, strings);
            }
            strings.add(strs[i]);
        }
      return new ArrayList(mapString.values());
    }
}
