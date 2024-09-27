//PROBLEM - group Anagrams
/** 3 Pointer Approcach: 
 * Used hash of 26 array for characters (a to z), by using array of 26 ints updates each word ASCII values.
 * The hash will give unique 26 size value for anagrams.
 */ 
//
//time Complexity :
// O(N K) => N is number of Strings and K is length of word with max length 

// Space Complexity :
//  O(N K) 

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.


import java.util.*;

class Problem1UsingArray {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List> map = new HashMap<>();
        
        int[] count =  new int[26];
        
        for(String s : strs){
           
           Arrays.fill(count,0);
            
           for(char c : s.toCharArray()){
               count[c -'a']++;
           }
               
           StringBuilder builder = new StringBuilder("#");  
           for(int n : count){
                builder.append(n);
           }
           
           String val = builder.toString();
               
           if(!map.containsKey(val)){
               map.put(val, new ArrayList());
           }  
            
            map.get(val).add(s);
        
        }
        
        return new ArrayList(map.values());
        
    }
}