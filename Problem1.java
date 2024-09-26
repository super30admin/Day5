import java.util.*;

//Time Complexity O(nklogk)
//Space Complexity O(n)


public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        HashMap<Double, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            double primeProdcut = getPrimeProduct(str);
            if (!hashMap.containsKey(primeProdcut)) {
                hashMap.put(primeProdcut, new ArrayList<>());
            }
            hashMap.get(primeProdcut).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }

    public double getPrimeProduct(String s) {
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prime = primes[c - 'a'];
            result = result * prime;
        }
        return result;
    }

//    public static void main(String[] args) {
//        String[] string = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};
//        String[] string1 = {"duh", "ill"};
//        List<List<String>> result = Problem1.groupAnagrams(string1);
//        System.out.println(result);
//    }
}
