//SOlving using hashing and prime numbers
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Integer, List<String>> groupedHash = new HashMap<>();
        for (String str : strs) {
            int currHash = generateHash(str, primes);
            groupedHash.computeIfAbsent(currHash, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groupedHash.values());
    }
    public static int generateHash(String str, int[] primes) {
        int hash = 1; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int charValue = c - 'a'; 
            hash *= primes[charValue]; 
        }
        return hash;
    }
}