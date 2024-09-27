import java.util.*;

// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :No
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> strsmap = new HashMap<>();
        for (String str : strs) {
            double primeProduct = getPrimeProduct(str);
            if (!strsmap.containsKey(primeProduct)) {
                strsmap.put(primeProduct, new ArrayList<>());
            }
            strsmap.get(primeProduct).add(str);
        }
        return new ArrayList<>(strsmap.values());
    }

    Double getPrimeProduct(String str) {
        double result = 1;
        int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }

    public static void main(String args[]) {
        GroupAnagrams obj = new GroupAnagrams();
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs));
    }
}
