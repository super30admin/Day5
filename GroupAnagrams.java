/*
    LC - 49. Group Anagrams
    TC - O(nk)
    SC - O(n)
    Approach - Store the key value pair in hashmap. where key is the prime product of string (which is unique always as per mathematical rule) and store the value as list in it. Return the list.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> myMap = new HashMap<>();
        for(int i=0; i< strs.length; i++) {
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(!myMap.containsKey(primeProduct)) {
                myMap.put(primeProduct, new ArrayList<>());
            }
            myMap.get(primeProduct).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
    public double primeProduct(String s) {
        int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
            73, 79, 83, 89, 97, 101
        };
        double result = 1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    } 
}