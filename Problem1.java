import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/
//Time Complexity O(N)
//Space Complexity O(N)

public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Double, List<String>> anagrams = new HashMap<>();

        for(String str :strs){

            Double hashVal = getHash(str);
            List<String> anaList = anagrams.getOrDefault(hashVal, new ArrayList<>());
            anaList.add(str);
            anagrams.put(hashVal,anaList);

        }

        return new ArrayList<>(anagrams.values());
    }


    Double getHash(String input){
        int[] primeArray = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double hash = 1;
        char[] inputChars = input.toCharArray();
        for(char c : inputChars){
            hash = hash * primeArray[c-'a'];
        }

        return hash;

    }
}
