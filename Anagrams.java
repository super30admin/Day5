// Time Complexity O(n* k ) where k is the average length of each string
// Space complexity is constant -O(n * k )
// Ran on leetcode : Yes itd running but on submitting it gives wrong answer
// problems faced : No

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    private static final int [] PRIMES = {
            2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101
    };
     public List<List<String>> groupAnagrams(String[] strs) {
         // HashMap tp group Anagrams
         Map<Long, List<String>> map = new HashMap<>();

         for (String str : strs){
             long product = calculatePrimeProduct(str);
             map.computeIfAbsent(product, k->new ArrayList<>()).add(str);

         }
         return new ArrayList<>(map.values());

    }

    private long calculatePrimeProduct(String str){
         long product = 1;
         for(char c : str.toCharArray()){
             product *= PRIMES[c - 'a'];
         }
         return product;
    }
    public static void main(String[] args) {
        Anagrams solution = new Anagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}