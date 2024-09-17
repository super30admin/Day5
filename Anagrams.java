//Time complexity: O(N*L) where N is size of array and L is length of string
//Space complexity: O(N*L)

import java.util.*;

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Long, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            // For each string in the array get a prime product
            long primeProduct = primeProduct(strs[i]);

            // Add an entry for the prime product with its associated string           
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList());
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    //This method gives a prime product of a string    
    private long primeProduct(String str) {
        long prod = 1;
        //26 prime numbers associated with every alphabet from a to z
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //calculate the product of prime numbers associated with each character in given string
            prod = prod * primes[c - 'a'];
        }
        return prod;
    }

    public static void main(String args[]){
        Anagrams anagram = new Anagrams();
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = anagram.groupAnagrams(str);

        for(List<String> lst : list) {
            for(String item : lst) {
                System.out.print(item+",");
            }
            System.out.print("\n");
        }
    }
}

/**

OUTPUT:

eat,tea,ate,
tan,nat,
bat,
 */