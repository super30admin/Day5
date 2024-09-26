// Time Complexity : O(Nk), where N is the number of strings and k is the average length of each string
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        double primeProduct = 1;

        //base case
        if(strs.length == 0) return new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();

        //Map to store the unique prime product (for each anagram) and its set of values.
        Map<Double, List<String>> hmap = new HashMap<>();

        //loop throgh number of strings
        for(String str: strs) {
            primeProduct = 1;

            //loop through characters of each string
            for(char c: str.toCharArray()) {
                //get prime product for the string
                primeProduct *= getPrimeValue(c);
            }

            //if prime product does not exist, create a new list to store the group of anagrams for that product
            if(!hmap.containsKey(primeProduct)){
                hmap.put(primeProduct, new ArrayList<String>());
            }
            //If prime product already exists, add the string to its corresponding list of anagramsx
            hmap.get(primeProduct).add(str);
        }
        return new ArrayList<>(hmap.values());
    }

    //gives corresponding prime value for the given character
    private int getPrimeValue(char c) {
        int[] prime = {2,3,5,7,9,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89, 97, 101, 103};
        return prime[c-'a'];
    }
}