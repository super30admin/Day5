// Time Complexity : O(n klogk) ,where n is the no. of strings in given array and k is the maximum length of the string in array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//CODE

class group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); // creating a hashmap of string and list of strings
        for (String s : strs) { // -> O(n)
            // sorting the string -> O( klogk)
            char[] arr = s.toCharArray(); // conerting each string into array of characters
            Arrays.sort(arr); // sorting the array of characters
            String sorted = String.valueOf(arr); // converting sorted char array into string

            if (!map.containsKey(sorted)) { // ->O(k) (because string has some length k with it , if we would have been
                                            // storing a integer instead of string then it would have been O(1))
                // if the map does not contain that sorted string as key then we will create a
                // new key ,value pair with key as sorted string and value as a list of strings
                // in array
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s); // if key is contained in map already , then we will add string s in the map
                                    // according to its key
        }
        return new ArrayList<>(map.values()); // returning list of values of map grouped together
        // overall complexity = O(n klogk+k) but we can ignore k term => O(n klogk)
    }

}
// Method-2
// Time Complexity : O(nk) ,where n is the no. of strings in given array and k
// is the maximum length of the string in array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// CODE

// prime product for eat = 11*2*73 and ate = 2*73*11 ; which is same for both
// ,so we will add both the strings to same key and will list them as anagram

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String s : strs) { // -> O(n)
            double primeProduct = primeProduct(s); // working in the same way as string are there in hashmap under the
                                                   // hood
            if (!map.containsKey(primeProduct)) { // if map does not contain that primeproduct , then we will create a
                                                  // new key value value pair
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s) {
        // calculating primeproduct
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97,
                101, 103 };
        double result = 1;
        for (int i = 0; i < s.length(); i++) { // O(k) ; where k is maximum length of the string
            char c = s.charAt(i); // getting characters from the string and then multiplying with its
                                  // corresponding prime value to get primeproduct
            result = result * primes[c - 'a'];
        }
        return result;
    }

}