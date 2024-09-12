import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode49 {

    // tc=O(nklogk)---> solution
    // sc=O(n)
    // public List<List<String>> groupAnagrams(String[] strs) {
    // if(strs==null || strs.length==0) return new ArrayList<>();

    // HashMap<String, List<String>> map=new HashMap<>();
    // for(int i=0;i<strs.length; i++){
    // String s=strs[i];
    // char[] carr=s.toCharArray();
    // Arrays.sort(carr);
    // String sorted=String.valueOf(carr);
    // if(!map.containsKey(sorted)){
    // map.put(sorted, new ArrayList<>());
    // }
    // map.get(sorted).add(s);
    // }

    // return new ArrayList<>(map.values());
    // }

    // tc=O(nk)---> solution
    // sc=O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Double, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            double product = productofprimes(s);
            if (!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private Double productofprimes(String s) {
        double result = 1;
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result *= primes[ch - 'a'];
        }
        return result;
    }
}
