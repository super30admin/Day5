import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
So in the above code the time complexity is O(NK)
where n is the number of the words and K is the number of characters in the word
Space Complexity is O(N)
*/

class AnagramSolution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<Double, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] charArray = s.toCharArray();
            double val = productPrime(charArray);
            if (!hashMap.containsKey(val)) {
                hashMap.put(val, new ArrayList<>());
            }
            hashMap.get(val).add(s);

        }
        return new ArrayList<>(hashMap.values());
    }

    private double productPrime(char[] charArray) {
        double ans = 1;
        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                89, 97, 101 };
        for (char c : charArray) {
            int prime = primeNumbers[c - 'a'];
            ans = ans * prime;
        }

        return ans;
    }
}