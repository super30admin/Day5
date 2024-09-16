package S30_Codes.Hashing_1;

// Time Complexity : O(kn) // n = size of strs // k = length of each str
// Space Complexity : O(n)
// Hashing-1 (V2)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();

        for(String str : strs){
            double key = getKey(str);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> value : map.values()){
            ans.add(value);
        }

        return ans;
    }

    private double getKey(String str){
        int[] primeArr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        double key = 1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            key *= primeArr[ch - 'a'];
        }

        return key;
    }
}