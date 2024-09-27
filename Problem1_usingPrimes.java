//PROBLEM - group Anagrams
/** 3 Pointer Approcach: 
 * Used prime numbers to generate Hashes/keys.
 * The prime number multipication is unique and will give unique value for anagrams 
 */ 
//
//time Complexity :
// O(N K) => N is number of Strings and K is length of word with max length 

// Space Complexity :
//  O(N K) 

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

import java.util.*;

class Problem1UsingPrimes {
      
    int[] primes = 
    new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        public List<List<String>> groupAnagrams(String[] strs) {
       
            if(strs.length == 0)
                return new ArrayList<>();
            
            //Map<Integer, List> map = new HashMap<>();
            Map<Integer, List<String>> map = new HashMap<>();

            for(String s : strs){
               
              int hash = 1;
                
               for(char c : s.toCharArray()){
                   hash *= primes[c-97];
               }
    
               if(!map.containsKey(hash)){
                   map.put(hash, new ArrayList());
               }  
                
                map.get(hash).add(s);
            
            }
            
            return new ArrayList(map.values());
            
        }
    }