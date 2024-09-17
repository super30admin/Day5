package S30.Hashing_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(n*k), n - number of strings, k- avg/max length of each string
// Space Complexity : O(n) - Storing all strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class GroupAnagrams {

    static int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return null;
        HashMap<Long,List<String>> map = new HashMap<>();

        for(String str : strs){
            Long hashKey = getPrimeHashKey(str);
            if(!map.containsKey(hashKey)){
                map.put(hashKey, new ArrayList<String>());
            }
            map.get(hashKey).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public Long getPrimeHashKey(String s){
        Long result = 1l;
        for(int i = 0; i < s.length(); i++){
            result *= primes[s.charAt(i) - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {


    }
}
