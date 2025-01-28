//The approach here is to use a hashmap to map the prime product of a word to a list of anagrams of that word.
//We use a prime array to find the key of the map which is the prime product of the word.
//Time Complexity: O(n*k) where n is the number of words and k is the average length of the word.
//Space Complexity: O(n) where n is the number of words.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s: strs){
            double pp = primeProduct(s);
            if(!map.containsKey(pp)){
                map.put(pp, new ArrayList<>());
            }
            map.get(pp).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s){
        int[] prime = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1.00;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            result = result * (prime[ch-'a']);
        }
        return result;
    }
}