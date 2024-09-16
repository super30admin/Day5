
// Time Complexity : O(nK)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

//Used product of prime numbers as unique hashmap key. Product of prime numbers is uniques and thus each letter is assigned a prime number. Everytime we have a word then a product is calculated and if we have that uniques product in hashmap then we add the word in arraylist else we create a new entry

import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Long, List<String>> hm = new HashMap<Long, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            long primeProduct = findPrimeProduct(strs[i]);

            if (!hm.containsKey(primeProduct)) {
                hm.put(primeProduct, new ArrayList<>());
            }
            hm.get(primeProduct).add(strs[i]);
        }

        return new ArrayList<List<String>>(hm.values());

    }

    public Long findPrimeProduct(String str) {

        int[] primeNo = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101, 103 };
        long product = 1;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int number = c[i] - 'a';
            product = product * primeNo[number];
        }

        return product;
    }
}