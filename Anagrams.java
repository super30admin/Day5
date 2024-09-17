//Run successfully on LeetCode: Yes
//Time Complexity: O(nk) Reduced complexity by not sorting the array and using prime product multiplication
//Space Complexity: O(nk)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str: strs)
        {
            double primeP = primeProduct(str);
            if(!map.containsKey(primeP)){
                map.put(primeP, new ArrayList<>());
            }
            map.get(primeP).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {
        Anagrams ana = new Anagrams();
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ana.groupAnagrams(str)); 
    }
    
}
