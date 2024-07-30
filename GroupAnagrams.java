// Time Complexity: O(m * k), where m is the number of strings and k is the average length of the strings
// Space Complexity: O(m * k), where m is the number of strings and k is the average length of the strings

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> result = new HashMap<>();
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103 };
        for (String s : strs) {
            Double key = (double)(1);
            for (char c : s.toCharArray()) {
                key = key * primes[c - 'a'];
            }
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        GroupAnagrams obj = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(input));
    }
}
