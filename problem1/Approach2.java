package problem1;

// Time Complexity : O(n⋅K)
// Space Complexity : O(n * K)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

//This is faster than the sorting-based approach (O(n * K log K)) because there is no sorting involved.
//K is the maximum length of a string,
//n is the no. of strings in strs

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Approach2 {
    public static void main(String[] args) {
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs = {};

        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap();

        for (String s : strs) {

            double pp = primeProduct(s);

            if(!map.containsKey(pp)) {
                map.put(pp, new ArrayList());
            }

            map.get(pp).add(s);
        }

        return new ArrayList(map.values());
    }

    private static double primeProduct(String s) {

        int prime[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1.0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result = result * (prime[ch - 'a']);
        }

        return result;
    }
}
