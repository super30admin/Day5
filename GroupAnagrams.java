/*
    1. Time Complexity : O(nk), n - number of strings, k - size of string
    2. Space Complexity : O(nk)   
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * Method 1:
 *      For each string calculate its frequency string. Two strings which have same freq string are anagrams
 *      Ex: "eat" and "tea" have the same frequncy string => a1b0c0d0e1f0g0h0i0j0k0l0m0n0o0p0q0r0s0t1u0v0w0x0y0z0
 *      Using the frequency string as key, insert all the strings in list as value in a HashMap.
 * Method 2:
 *      Similar to method 1 but instead of caculating frequency string, calculate the primeProduct for each string
 *      Maintain a prime array arr[26] where index = 0 represents prime number for 'a'
 *      Ex: prime_product("eat") = arr['e' - 'a'] * arr['a' - 'a'] * arr['t' - 'a']
 *          prime_product("tea") = arr['t' - 'a'] * arr['e' - 'a'] * arr['a' - 'a'] = prime_product("eat")
 */

import java.util.*;
class Solution {
    private static String freqString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c-'a']++;
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i = 0; i < 26; ++i) {
            c = (char) ('a' + i);
            sb.append(c);
            sb.append(freq[i]);
        }
        return sb.toString();
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> list;
        String f;
        for(String s: strs) {
            f = freqString(s);
            list = map.getOrDefault(f, new ArrayList<String>());
            list.add(s);
            map.put(f, list);
        }
        return new ArrayList<>(map.values());
    }
    private static int[] prime = {2,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
    private static Long primeProduct(String s) {
        Long result = 1L;
        for (char c : s.toCharArray())
            result *= prime[c - 'a'];
        return result;
    }
    public static List<List<String>> groupAnagramsUsingPrimeProduct(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();
        List<String> list;
        Long key;
        for(String s: strs) {
            key = primeProduct(s);
            list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagramsUsingPrimeProduct(strs));
    }
}