// Time Complexity : O(mn) m is the number of words and n is the length of
//                         the longest word 
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Calculate the prime product for each product by assigning a unique prime
// number for every alphabet. Group words that give the same prime product value.

import java.util.*;
import java.io.*;
class Solution {
    int[] primes = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    HashMap<Double,List<String>>  m = new HashMap<Double,List<String>>(); 
    List<List<String>> output;
    public List<List<String>> groupAnagrams(String[] strs) {
        int stringCount = strs.length;
        for(int i =0;i<stringCount;i++){
            double ascii = 1;
            for(int j = 0;j<strs[i].length();j++){
                ascii = ascii*primes[strs[i].charAt(j)-'a'];
            }
            if(m.containsKey(ascii)){
                m.get(ascii).add(strs[i]);
            }
            else{
                m.put(ascii, new ArrayList<String>(Arrays.asList(strs[i]))) ;
            }
        }
        List<List<String>> output = new ArrayList<List<String>>(m.values());
        return output;
    }
}