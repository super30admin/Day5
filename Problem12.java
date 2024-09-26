import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * https://leetcode.com/problems/group-anagrams/
 * 
 * 
 * Constraints:
    1 <= strs.length <= 104         ==> n 
    0 <= strs[i].length <= 100      ==> k
    strs[i] consists of lowercase English letters.
 * 
 */

/**
 * brute force solution
 * 
 *  * time complexity: O(nk log k) 
 * ============================
 * n = size of the array of strings, k = avg length of each string
 * 
 * => O(nk log k + k) + O(n)
 * n     --> array of string size
 * klogk --> heap sort --> Arrays.sort()
 * + k   --> hashing time 
 * O(n)  --> iterating over the result of hashMap values
 * 
 * reducing it we get 
 * => O(nk log k) 
 * 
 * space complexity: O(nk)
 * =======================
 * n (keys), k = avg length of each key
 * 
 * we should not count the result(values) and input (Auxilary data structures) for space complexity
 */
public class Problem12{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sMap = new HashMap<>();
        
        for(String s : strs){
            char[] raw = s.toCharArray();
            Arrays.sort(raw);
            String sorted = String.valueOf(raw);
            
            if(!sMap.containsKey(sorted)){
                sMap.put(sorted, new ArrayList<>());
            }
            sMap.get(sorted).add(s);
        }
        
        return new ArrayList<>(sMap.values());
    }
    public static void main(String[] args) {
        
    }
}

/**
 * Using prime products of each string as key for the hashMap
 * 
 *  * time complexity: O(nk) 
 * ============================
 * n = size of the array of strings, k = length of each string
 * 
 * => O(nk) + O(n)
 * n     --> array of string size 
 * k     --> length of each string
 * O(n)  --> iterating over the result of hashMap values
 * 
 * reducing it we get 
 * => O(nk log k) 
 * 
 * space complexity: O(n)
 * =======================
 * n (keys) 
 * 
 * we should not count the result(values) and input (Auxilary data structures) for space complexity
 */
class Problem12Approach1{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> sMap = new HashMap<>();
        
        for(String s: strs){
            Double k = primeProduct(s);
            
            if(!sMap.containsKey(k)){
                sMap.put(k, new ArrayList<>());
            }
            sMap.get(k).add(s);
        }
        
        return new ArrayList<>(sMap.values());
    }
    
    public double primeProduct(String s){
                int[] primeNos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1;
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            result *= primeNos[(c-'a')];
        }
        return result;
    }
}