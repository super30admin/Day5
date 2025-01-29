// Time Complexity : O(n)
// Space Complexity : O(1) - Since the number of characters in the hashmap will be constant.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Group Anagrams: I have used a hashmap to store the prime product of the strings. I have iterated through the strings and calculated the prime product of the strings. I have checked if the prime product is already present in the map. If it is present, I have added the string to the list corresponding to the prime product. If it is not present, I have added the prime product to the map and added the string to the list corresponding to the prime product. I have added all the lists to the final list and returned the final list.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        if(strs == null || strs.length == 0){
            return list;
        }

        Map<Double, List<String>> map = new HashMap<>();

        for(String str: strs){
            double pp = primeProduct(str);

            if(!map.containsKey(pp)){
                map.put(pp, new ArrayList<>());
            }
            map.get(pp).add(str);
        }

        list.addAll(map.values());
        return list;
    }

    private double primeProduct(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 63, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        double res = 1.0;
        for(int i = 0; i < s.length(); i++){
            res *= prime[s.charAt(i)-'a'];
        }
        return res;
    }
}
