//This solution uses prime factorization hashing technique - a technique where each character is mapped to a prime number 
//and the product of the numbers associated with the strings having same characters will be unique and we can use this product 
//as key and add the strings with similar prime product to value list and finally prepare a list of values and returns it
class Solution {
    public java.util.List<java.util.List<String>> groupAnagrams(String[] strs) {
        java.util.HashMap<Double, java.util.List<String>> groupedAnagrams = new java.util.HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            double key = getPrimeProduct(strs[i]);
            if (groupedAnagrams.get(key) == null) {
                groupedAnagrams.put(key, new java.util.ArrayList<>());
            }
            groupedAnagrams.get(key).add(strs[i]);
        }
        return new java.util.ArrayList<>(groupedAnagrams.values());
    }

    double getPrimeProduct(String str) {
        int primeNums[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101 };
        double result = 1.0;
        for (int j = 0; j < str.length(); j++) {
            result = result * primeNums[str.charAt(j) - 'a'];
        }
        return result;
    }

}