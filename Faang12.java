package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Time Complexity : O(n k log k) n  number of words and k letters
// Space complexity  : O(n) n is number of words



class Faang12{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str :strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted =String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}