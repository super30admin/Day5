import java.util.ArrayList;
// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        HashMap<Double, List<String>> aMap = new HashMap<>();
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        for(String str: strs){
            double hashResult = 1;
            for(int i = 0; i<str.length(); i++){
                 hashResult  = hashResult * primes[str.charAt(i) - 'a'];
            }
            if(!aMap.containsKey(hashResult)){
                aMap.put(hashResult, new ArrayList<>());
            }
            aMap.get(hashResult).add(str);
        }
        return new ArrayList<>(aMap.values());
    }
}
