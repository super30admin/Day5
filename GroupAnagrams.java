import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map=new HashMap<>();
        for (String s:strs){
            double primeprod= PrimeProduct(s);
            if(!map.containsKey(primeprod)){
                map.put(primeprod,new ArrayList<>());
            }
            map.get(primeprod).add(s);
        }
        return new ArrayList<>(map.values());
    }
    private double PrimeProduct(String s){
        int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31, 37, 41, 43, 47, 53,59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double result=1d;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            result=result*(prime[c-'a']);
        }
        return result;
    }
}