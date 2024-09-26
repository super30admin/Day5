// TIME: O(nk)
// SPACE: O(n)
// SUCCESS on LeetCode


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> anagramList = new HashMap<>();
        for (String str : strs) {
            double index = primeFactor(str);
            if (!anagramList.containsKey(index)) {
                anagramList.put(index, new ArrayList<>()); 
            } 
            anagramList.get(index).add(str);
        }

        
        return new ArrayList<>(anagramList.values());
    }
    
    private double primeFactor(String a) {
        int[] primeFactors = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
        double index = 1;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            index = index * primeFactors[c - 'a'] ;
        }
        return index;
    }
}