
/**
 * Time Complexity: O(n + k) where n is the number of strings and k is the length of each string
 * Space Complexity: O(n) where n is the number of string which gets stored in hashmap.
 * 
 * Approach: For every character, we assign a prime number. The idea is product of 2 prime numbers is unique.
 * We iterate over every string and compute the prime product of that string.
 * If the prime product exists in the map, we add it to the existing list.
 * If the prime product does not exist, we initialize a new list and add the current string.
 * At the end, we return list of values of hashmap.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) {
      return new ArrayList<>();
    }
    Map<Double, List<String>> map = new HashMap<>();
    for (String str : strs) {
      double primeProduct = getPrimeProduct(str);
      if (!map.containsKey(primeProduct)) {
        map.put(primeProduct, new ArrayList<>());
      }
      map.get(primeProduct).add(str);
    }
    return new ArrayList<>(map.values());
  }

  private double getPrimeProduct(String s) {
    int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
        89, 97, 101 };
    char[] chars = s.toCharArray();
    double result = 1;
    for (char c : chars) {
      result *= primes[c - 'a'];
    }
    return result;
  }

}