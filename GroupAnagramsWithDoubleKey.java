/**
 Approach 2: Using Hashmap {key,value} -> {primeProduct, list of anagrams}

 Working: Iterating through the string array length finding the prime product of each string in array and checking if
            it contains key in the map, if yes, add the value to the corresponding list

 Why prime product: Mathematically product of prime numbers ia always unique

 Additionally, If we are using the double/integer value, the retrieve from the hash map would be faster than the retrival of a string
 from the hash map as a string internal maps with each character in a hash mpa

 Time Complexity: O(nm)
 Space Complexity: O(1) //as the maximum range of a string can go upto 26 chars which is much less than the limit provided as the length of the string
 */

class GroupAnagramsWithDoubleKey {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return new ArrayList<>(new ArrayList<>());
        }

        int l = strs.length;
        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i=0;i<l;i++) {

            String s = strs[i];

            double primeProduct = getPrimeProduct(s);

            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }

            map.get(primeProduct).add(s);
        }


        return new ArrayList<>(map.values());
    }

    public double getPrimeProduct(String s) {

        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        double product = 1;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int primeVal = prime[c-'a'];

            product *=primeVal;
        }

        return product;
    }
}