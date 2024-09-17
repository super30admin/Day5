import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time complexity: O(nk) n-> number of strings in an array, k -> max length of a String
// Space complexity: O(1) since prime number array is of size 26 which can be considered as constant
public class Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;

        Map<Double,List<String>> data = new HashMap<>();

        for(String str : strs){
            double product = getPrimeProduct(str);
            if(!data.containsKey(product)){
                data.put(product,new ArrayList<>());
            }

            data.get(product).add(str);
        }



        return new ArrayList<>(data.values());
    }

    // Prime numbers always provide a unique product
    // Compare 2 * 4 * 6 = 48 (multiple combinations can be found if we factor it out) with 2 * 3 * 5 = 30 (unique combinations of prime numbers)
    private double getPrimeProduct(String str){
        int[] primeNumbers = {2,3,5,7,9,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        double result = 1;
        for(int i=0; i< str.length();i++) {
            char c = str.charAt(i);
            result = result * primeNumbers[c - 'a'];
        }

        return result;
    }
}
