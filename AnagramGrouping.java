// Time Complexity : O(n)
// Space Complexity : O(n) - worst case there will be a new key for each string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coming up with logic of calculating prime value


import java.util.*;

class AnagramGrouping {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long, ArrayList<String>> map = new HashMap<>();

        for(String str : strs) {

            long primeValue = calculatePrimeValue(str);

            // If the primeValue already exists, append the string to the corresponding array
            if(map.containsKey(primeValue)) {
                map.get(primeValue).add(str);
            } else {

                // else, create a new arraylist and append the string, and put the array in the map 
                ArrayList<String> newValue = new ArrayList<>();
                newValue.add(str);
                map.put(primeValue, newValue);
            }

        }

        // return the values as string arrays
        List<List<String>> result = new ArrayList<>();
        for (Long p : map.keySet()) {
            result.add(map.get(p));
        }
        return result;

    }

    public long calculatePrimeValue(String str) {

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        long primeValue = 1;
        for(int i=0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            int prime = primes[currentChar - 'a'];
            primeValue = primeValue * prime;

        }

        return primeValue;

    }
}