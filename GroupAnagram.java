import java.util.*;
/*
Time complexity - O(nklogk)
Space complexity - O(nk)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);

            if(!hm.containsKey(sortedStr)){
                hm.put(sortedStr, new ArrayList<>());
            }
            hm.get(sortedStr).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
*/

//Time complexity - O(nk)
//Space complexity - O(1)
class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> hm = new HashMap<>();
        for(int i = 0;i< strs.length;i++){
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(!hm.containsKey(primeProduct)){
                hm.put(primeProduct, new ArrayList<>());
            }
            hm.get(primeProduct).add(s);

        }
        return new ArrayList<>(hm.values());
    }

    private double primeProduct(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
         61, 67, 71, 73, 79, 83, 89, 97, 100, 103};
        double result = 1;
         for(int i=0; i< s.length();i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
         }
         return result;
    }
}
