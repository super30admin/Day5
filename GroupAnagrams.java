import java.util.*;

class GroupAnagrams {
    public static void main(String[] args) {
        String[] Input = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupAnagrams(Input);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            double primeProduct = primeProduct(str);
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);

        }

        return new ArrayList<>(map.values());

    }

    public static double primeProduct(String s) {
        double result = 1;
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];

        }
        System.out.println(result);

        return result;

    }

}