
// TC : O(nk) -> O(k) = to find the primeProduct of each String, as we parse with all string in the array, it is O(n) , hence, O(nk)
//Space: O(n), if we have n unique keys then we might have to parse with all.

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> findAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> hmap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String givenString = strs[i];
            Double primeProduct = calculatePrimeProduct(givenString);
            if (!hmap.containsKey(primeProduct)) {
                hmap.put(primeProduct, new ArrayList<>());
            }
            hmap.get(primeProduct).add(givenString);

        }

        return new ArrayList<>(hmap.values());
    }

    public double calculatePrimeProduct(String passedString) {
        int[] primeNos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101 };
        double product = 1;
        for (int i = 0; i < passedString.length(); i++) {
            char givenChar = passedString.charAt(i);
            product = product * primeNos[givenChar - 'a'];
        }
        return product;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.findAnagrams(strs));
    }
}