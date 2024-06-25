import java.util.*;

public class GroupAnagrams {
    static int[] primes =
            {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    public static List<List<String>> groupAnagrams(String[] strs) {
        //Hashmap storing the prime product as key and list of anagrams as value
        HashMap<Double, List<String>> anagramsList = new HashMap<>();
        for (String string : strs) { //Iterating over the strings
            //calculate unique key value by multiplying the corresponding prime values
            double primeProduct = primeProduct(string);
            if (!anagramsList.containsKey(primeProduct)) { //if key is not present already
                anagramsList.put(primeProduct, new ArrayList<>()); //double hashing
            }
            anagramsList.get(primeProduct).add(string); //add the string as value to above key
        }
        return new ArrayList<>(anagramsList.values());
    }

    private static double primeProduct (String string){
        double product = 1;
        for(int i=0; i<string.length(); i++) {
            char schar = string.charAt(i); //getting each char from the string
            //[character - 'a'] gives the integer index of alphabets by subtracting their ASCII values from 'a'
            product *= primes[schar - 'a'];
        }
        return product;
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"tin", "ram", "zip", "cry", "pus", "jon", "zip", "pyx", "sup"};
        String[] s2 = new String[]{"eat","tea","tan","ate","nat","bat", "tab"};
        System.out.println(groupAnagrams(s1));
        System.out.println(groupAnagrams(s2));
    }
}