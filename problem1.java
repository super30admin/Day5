import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class anagramsString{
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double, List<String>> map = new HashMap<>();

        for(String str : strs){
            double primeNumber = getPrimeNumber(str);
            if(!map.containsKey(primeNumber)){
                map.put(primeNumber, new ArrayList<>());
            }
            map.get(primeNumber).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getPrimeNumber(String str){
        double result = 1;
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i =0; i< str.length(); i++){
            char c = str.charAt(i);
            int prime = primes[c - 'a'];
            result = result * prime;
        }
        return result;
    }

    public static void main(String[] args) {
        anagramsString as = new anagramsString();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.asList(as.groupAnagrams(strs)));
    }
}