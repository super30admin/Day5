//time o(nk) where n is the number of strings in the list and k is the length of each string
//space o(n) the map will have fixed size

import java.util.*;

class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null)
            return new ArrayList();
        HashMap<Double, List<String>> groupMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            double primeProduct = calculateProduct(strs[i]);
            if (!groupMap.containsKey(primeProduct)) {
                groupMap.put(primeProduct, new ArrayList<>());
            }
            groupMap.get(primeProduct).add(strs[i]);
        }
        return new ArrayList(groupMap.values());
    }

    private Double calculateProduct(String s) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}