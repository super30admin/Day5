/*
Time Complexity: O(nk) where n is length of input string array and k is length of string
Space complexity: O(nk) used by map

Approach: by having understanding that product of prime number is unique we take the 26 characters each representing unique prime number. Then we go and take product of prime number as characters in string to calculate it as a key for map and then grp our values as per this key to find anagrams.
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> result = new HashMap<>();

        for(String entry : strs) {
            double primeProduct = getPrimeProduct(entry);

            if(!result.containsKey(primeProduct)) {
                result.put(primeProduct, new ArrayList<>());
            }

            result.get(primeProduct).add(entry);
        }

        return new ArrayList<>(result.values());
    }

    private double getPrimeProduct(String entry) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double primeProduct = 1;
        for(char c : entry.toCharArray()) {
            primeProduct *= primes[c - 'a'];
        }

        return primeProduct;
    }
}