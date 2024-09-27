// Time complexity: O(N*K), where N is the length of the strs array and K is the maximum length of a string in strs array. 
// Space complexity: O(N*K), for storing the mappings in map. 

import java.util.*;

class Solution1 {
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public long calculateCode(String str) {
        long code = 1;
        for(char c: str.toCharArray()) {
            //multiply primes of characters without considering the position. 
            code *= primes[c-'a'];
        }
        return code;
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //calculate code
            long code = calculateCode(str);
            //get list if key is already present or initiate a new list corresponding to the code. 
            List<String> list = map.getOrDefault(code, new ArrayList<>());
            //add the string to the list
            list.add(str);
            //put the code to list mapping in map
            map.put(code, list);
        }
        List<List<String>> output = new ArrayList<>();
        //iterate through map to put values in output list. 
        for (List<String> value : map.values()) {
            output.add(value); 
        }
        return output;
    }
}