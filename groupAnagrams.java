import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;



//Time complexity:O(n*k)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :no

class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str: strs){
            double primeProduct=primeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());

    }
    private double primeProduct(String s){
        double result =1;
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            result=result*primes[c - 'a'];
        }
        return result;
    }
}