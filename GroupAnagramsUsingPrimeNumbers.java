import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Time complexity is O(nk)
 * Space complexity is O(nk)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class GroupAnagramsUsingPrimeNumbers {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        result.stream().forEach(strings -> System.out.println(strings));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String s: strs){
            double primeProduct = getPrimeProduct(s);

            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }

            map.get(primeProduct).add(s);
        }

        return  new ArrayList<>(map.values());
    }

    private static double getPrimeProduct(String s){
        double result = 1;

        int[] primes = {2, 3, 5, 7,
                11, 13, 17, 19,
                23, 29,
                31, 37,
                41, 43, 47,
                53, 59,
                61, 67,
                71, 73, 79,
                83, 89,
                97,
                101, 103};

        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            int prime = primes[c - 'a'];

            result = result * prime;
        }

        return result;
    }
}
