import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Unoptimized version
        // HashMap<String, List<String>> map = new HashMap<>();
        // for(String word: strs){
        //     char[] charArray = word.toCharArray();
        //     Arrays.sort(charArray);
        //     String sorted = String.valueOf(charArray);
        //     if(!map.containsKey(sorted)){
        //         map.put(sorted, new ArrayList<>());
        //     }
        //     map.get(sorted).add(word);
        // }
        // return new ArrayList<>(map.values());

        //Optimized Version
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String current: strs){
            Double result = primeMultiplier(current);
            if(!map.containsKey(result)){
                map.put(result, new ArrayList<>());
            }
            map.get(result).add(current);
        }
        return new ArrayList<>(map.values());
    }
    public static Double primeMultiplier(String input){
        Integer[] primeMapper = new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        Double result = 1.0;
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            result *= primeMapper[c-'a'];
        }
        return result;
    }
}