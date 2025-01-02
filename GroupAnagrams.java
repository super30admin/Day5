// Approach: The key idea here is that when the characters of two anagrams are sorted, they both yield the same sorted string. We can
// use a hashmap to map the sorted forms of input strings to lists of strings that produce the same sorted form (i.e., anagrams). The
// values of the hashmap represent groups of anagrams.
// Time Complexity : O(n) where n - strs.length
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Map;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

public class GroupAnagrams {

    List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(s);
            map.put(sorted, list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = { "eat","tea","tan","ate","nat","bat" };
        List<List<String>> anagramList = ga.groupAnagrams(strs);
        for (List<String> anagrams : anagramList) {
            System.out.println(anagrams.toString());
        }
    }
}