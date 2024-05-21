import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    /**
     *
     * Algo:
     * - sort each string map the sorted string --> list of string with same sorted strings.
     * Time Complexity: O(nklog(k)) n->Number of elements in the array. and k is the average length of the String
     *
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs ==null || strs.length==0)
            return new ArrayList<>();
        List<List<String>> list  = new ArrayList<>();
        HashMap<String, ArrayList<String>> sortedMapping = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!sortedMapping.containsKey(sortedStr)){
                sortedMapping.put(sortedStr,new ArrayList<>());
            }
            sortedMapping.get(sortedStr).add(s);
        }

        return new ArrayList<>(sortedMapping.values());
    }

    /**
     *
     * This Algorithm works on principal -  product of 2 primes will always be unique.
     * since the question says only small alphabets we map each character to a prime number/
     *
     * Algo:
     * compare create hash map and map the product of the primes of charters in the string.
     * This Key will be unique for each set of chars irrespective of the order
     *
     * Time Complexity : O(nk)
     *
     */
    public List<List<String>> groupAnagramsUsingPrimeNumbers(String[] strs) {
        if(strs ==null || strs.length==0)
            return new ArrayList<>();
        HashMap<Double,ArrayList<String>> map = new HashMap();
        for(String s:strs){
            Double primeCode = getPrimeCode(s);
            if(!map.containsKey(primeCode))
                map.put(primeCode,new ArrayList<String>());
            map.get(primeCode).add(s);
        }
        return new ArrayList(map.values());
    }

    private Double getPrimeCode(String s){
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        char[] charArray = s.toCharArray();
        Double productCode = 1d;
        for(char c:charArray){
            productCode*=primes[c-'a'];
        }
        return productCode;
    }

//    public List<List<String>> groupAnagramsUsingArray(String[] strs) {
//
//    }
}
