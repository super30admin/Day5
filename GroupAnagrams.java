import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Idea is to use a HashMap, key would be sorted version of the token. Anagrams
 * have the same frequency of letters in them, hence sorted token would be same.
 * 
 * Space Complexity: O(N*K), where N is the number of token, K is length of
 * longest token 
 * Time Complexity: O(N*K*log K), where N is the number of token,
 * K is length of longest token
 * 
 * Leetcode Result:
 * Runtime: 9 ms, faster than 79.09% of Java online submissions for Group Anagrams.
 * Memory Usage: 42.4 MB, less than 89.47% of Java online submissions for Group Anagrams.
 * 
 * Another Approach: 
 *      1. Using prime number, first 26 primes are mapped to each
 *         letter a-z, prime products of anagrams are equal.
 * 
 */
public class GroupAnagrams {
    /**
     * Group Anagrams
     * 
     * @param strs string array
     * @return list of list each containing anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // base case checks
        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        HashMap<String, List<String>> result = new HashMap<String, List<String>>();
        for (String token : strs) {
            // sort each token s
            char[] arr = token.toCharArray();
            Arrays.sort(arr);
            String keyStr = String.valueOf(arr); // sorted string of token
            if (!result.containsKey(keyStr)) { // if this key is seen for first time
                result.put(keyStr, new ArrayList<String>());
            }
            result.get(keyStr).add(token);
        }
        return new ArrayList<List<String>>(result.values());
    }
}
