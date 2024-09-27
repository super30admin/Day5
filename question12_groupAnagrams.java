package Hashing1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class question12_groupAnagrams {

    /*
    Using HashMap ---->
        Time Complexity : O(nk) ; k: average length of each word
        Space Complexity: O(n) I guess, I am not sure about this tho as
                               I am checking if the set contains the missing value or not.
     */

    private List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    /*
    Using HashMap (by calculating the prime product and storing it as key in hashmap)---->
        Time Complexity : O(nk) ; k: average length of each word
        Space Complexity: O(n) I guess, I am not sure about this tho as
                               I am checking if the set contains the missing value or not.
     */

    public List<List<String>> groupAnagrams1(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String str : strs) {
            // taking the Prime Product of each word and storing it in the HashMap.
            long primeProduct = primeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private long primeProduct(String s) {
        long result = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};

        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
