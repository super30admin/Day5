package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramPrime {

    private long primeProduct(String s){

        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long res  = 1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            //characters subtraction, subtracts their ASCII values; with this we get the index of the array corresponding to c
            res = res * primes[c - 'a'];
        }
        return res;
    }

    public List<List<String>> groupAnagrams(String[] str){

        //Edge case
        if(str == null || str.length == 0){
            return new ArrayList<>();
        }

        HashMap<Long, List<String>> map = new HashMap<>();

        // sorting of each string in the given array and storing in new characters array
        for(String s : str) {
            long primeProduct = primeProduct(s);

            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            //contains or not you will do this part
            //like if key is new you will create and array and then add corresponding string
            //else it exist, add to the list Therefore add() of ArrayList
            map.get(primeProduct).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String args[]){
        String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};

        AnagramSort ob = new AnagramSort();

        List<List<String>> res = ob.groupAnagrams(str);

    }
}
