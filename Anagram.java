// Time Complexity - O(N*K)
// Space Complexity - O(N*K)
// Ran on LeetCode
// No issues

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, ArrayList<String>> values = new HashMap<>();
        for(String str : strs){
            double summation = calculatePrimes(str);
            if(!values.containsKey(summation))
                values.put(summation, new ArrayList<>());
            values.get(summation).add(str);
        }
        return new ArrayList<>(values.values());
    }

    public static Double calculatePrimes(String str){
        double result = 1;
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(char ch : str.toCharArray())
            result *= primes[ch - 'a'];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
