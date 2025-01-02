// Time Complexity : O(n*k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Calculate prime product for each string in the array and then group the strings using HashMap and ArrayList

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SolutionGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            double primeProduct = findPrimeProduct(strs[i]);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    private double findPrimeProduct(String str) {
        int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double primeProduct = 1;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            primeProduct *= arr[c - 'a'];
        }
        return primeProduct;
    }
}