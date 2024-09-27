/*
let N = Size of string array, k = avg length of string
Solution 1: //By sorting the letters and then using it as key to group all anagrams
    Time Complexity = O(Nklogk) {iterate through string array of size N * sort char[] of avg size k = logk * find hash for string of size k}
    Space Complexity = O(N) {N entries in hashmap}
    Did this code successfully run on Leetcode : yes

Solution 2: //By using product of corresponding primes as key to group anagrams
    Time Complexity = O(Nk) {iterate through string array of size N * find hash for string of avg size k}
    Space Complexity = O(N) {N entries in hashmap}
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//problem not discussed yet
public class GroupAnagrams {
}

//By sorting the letters and then using it as key to group all anagrams
class SolutionB1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> hm = new HashMap<>();

        for(String each: strs){
            char[] letters = each.toCharArray();
            Arrays.sort(letters);
            String k = String.valueOf(letters);
            if(hm.containsKey(k)){
                hm.get(k).add(each);
            }else{
                List<String> list = new ArrayList<>();
                list.add(each);
                hm.put(k, list);
            }
        }

        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        SolutionB1 s = new SolutionB1();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
    }
}

//By using product of corresponding primes as key to group anagrams
//uses property: product of primes is unique
class SolutionB2 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> hm = new HashMap<>();

        for(String each: strs){
            Double product = getProduct(each);
            if(hm.containsKey(product)){
                hm.get(product).add(each);
            }else{
                List<String> list = new ArrayList<>();
                list.add(each);
                hm.put(product, list);
            }
        }

        return new ArrayList<>(hm.values());

    }

    private double getProduct(String str){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        Double product = 1.0;

        char[] letters = str.toCharArray();

        for(char each: letters){
            product = product * (prime[each - 'a']);
        }

        return product;

    }

    public static void main(String[] args) {
        SolutionB2 s = new SolutionB2();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
    }
}
