// Time Complexity : O(n^2logn) ; 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams
 */
public class GroupAnagrams {

    private int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
 
     public List<List<String>> groupAnagrams(String[] strs) {
 
         Map<Double, List<String>> strsMap = new HashMap<>();
 
         for(int i=0; i<strs.length; i++) {
             //Sorting String using quick sort
             //So that all anagrams generates same key element
             Double key = getKey(strs[i]);
             if(!strsMap.containsKey(key)) {
                ArrayList<String> list = new ArrayList<String>();
                strsMap.put(key, list);
                
             }
            ArrayList<String> list = (ArrayList<String>)strsMap.get(key);
            list.add(strs[i]);
         }
         List<List<String>> grouppedStrs = new ArrayList(strsMap.values());
         return grouppedStrs;
     }
     public double getKey(String str){
         double res = 1;
        for(char ch : str.toCharArray()){
            res *= primeNumbers[ch - 'a'];
        }
         return res;
     }
 }