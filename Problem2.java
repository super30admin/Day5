import java.util.*;

public class Problem2 {

    //here the approach is to first sort each string and maintain a hashmap whose key will be sorted string and value will be list of string which has unsorted value which prev was converted to sorted.
    // Time Complexity : O(nKlogK) -> n no of strings, klogk to sort the string
    // Space Complexity : O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) return new ArrayList<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!map.containsKey(sorted)){
                map.put( sorted,new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }





    // Time Complexity : O(nK)
    // Space Complexity : O(n)

    //here the approach is that product of a prime number is always unique and we've only  lower case alphabet.
//we're gonna map every character of a string to a prime number and get the product of the character at each string we'll get a unique result and we're gonna use that result as key in the map.
    public List<List<String>> groupAnagrams1(String[] strs) {
        Map<Double,List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) return new ArrayList<>();
        for(String s : strs){
            //find the prime product of particular string.
            double primeProduct = getPrimeProduct(s);
            //search if in map that key exist.
            if(!map.containsKey(primeProduct)){
                //if not create an entry in the map with value as new arraylist
                map.put(primeProduct,new ArrayList<String>());
            }
            //put the key and value as prime product and the actual string.
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String s){
        //first 26 prime number
        int[] primeNum = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double result = 1;
        //for each character of string loop and get the product of each string.
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //abc -> a*b*c -> 2*3*5;
            //primeNum[c-'a'] because the ascii value of lower case starts from 97 we need to reduce it in such a way that it start from 2
            result = result * primeNum[c-'a'];
        }

        return result;
    }
}
