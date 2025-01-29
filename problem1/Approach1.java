package problem1;

// Time Complexity : O(n⋅KlogK)
// Space Complexity : O(n * K)
//K is the maximum length of a string,
//n is the no. of strings in strs
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Approach1 {

    public static void main(String[] args) {
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs = {};

        System.out.println(groupAnagrams(strs));
    }

    public static List<String> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap();

        // n(KlogK)
        for(String s : strs) {
            char[] charArr= s.toCharArray();
            Arrays.sort(charArr);

            String sorted = String.valueOf(charArr);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList());
            }

            map.get(sorted).add(s);
        }

        return new ArrayList(map.values());
    }
}
