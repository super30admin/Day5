/*
LC 49: Medium: https://leetcode.com/problems/group-anagrams/
Time Complexity : O(n*l); n - number of words, l - average length of words
Space Complexity : O(n*l)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no

Your code here along with comments explaining your approach
Map <Product of primes, List of strings>
*/

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int primes[] = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        HashMap<Long, List<String>> map = new HashMap<>();
        long product = 1;
        
        for (int i = 0; i < strs.length; i++) {
            product = 1;
            String s = strs[i];
            for (char c: s.toCharArray()) {
                product = product * primes[c-'a'];
            }
            
            if (!map.containsKey(product)) {
                map.put(product, new ArrayList<String>());
            }
            map.get(product).add(s);
        }
        return new ArrayList<List<String>>(map.values());
        
    }
}