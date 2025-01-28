/*Time complexity: O(n*k) since we are iterating over every string in the list size n and for each string trying to get the product of its primes.
 * Space complexity : O(n) to store the hashmap.
 * Leetcode : yes
 * Any Problems : No
 */
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class GroupAnagrams {
    //this method returns the product of the primes corresponding to its characters ASCII value for the given string.
    private double getCharProduct(String s)
    {
        //array of 26 prime numbers
        int[] primeArr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,73, 79, 83, 89, 97, 101};
        double res = 1;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            res *= primeArr[c-'a'];
        }
        return res;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        //using a map to store the key which is the product of prime numbers of its corresponding characters. 
        HashMap<Double, List<String>> map = new HashMap<>();
        //for each string we get the product and use it as a key, if key exists we add the current string to the list, 
        //otherwise we just create a new entry and add the string to list value.
        for(String s : strs)
        {
            double key = getCharProduct(s);
            map.put(key, map.getOrDefault(key, new ArrayList<>()));
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

