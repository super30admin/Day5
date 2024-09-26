/*
 * Time Complexity: O (N.KlogK)
 * 
 * 	- Outer for loop -> O (N)
 * 	- Sorting character array -> O (KlogK) -> uses quick sort internally
 * 	- We perform sorting for each string in an array, 
 * 	- So, total time Complexity is: O (N.KlogK)
 * 
 * Space Complexity: O (NK) -> total information content (Key, Value) pairs stored in a map
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.hashing1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        //1. Validation check on input
        /*
        * If input string array is empty, return empty arraylist
        * [[]]
        */
        if(strs.length == 0)
            return new ArrayList();
        
        //2. Create a map to store sorted string as a key and its anagrams as value
        /*
        * key stored as a sorted string
        * value stored as a List of anagrams
        */
        Map<String, List> ans = new HashMap<String, List>();
        
        //3. Traverse through the String array "strs"
        /*
         * For every string in array:
            - Convert the string to character array
            - Sort the character array
            - Convert the sorted character array into a string and assign it to a key variable
            - Check if the key is already present in a map "ans"
                    - If not, put the key as KEY and create new empty arraylist as a VALUE in a map
                    - Since the sorted string of 's' is equal to KEY in a map (two sorted strings are equal -> anagrams), add the string 's' (anagram) as VALUE                       in a arraylist in map for particular KEY
            - Repeat the above steps for ever string until whole array is traversed
            - After exiting the for loop, return the values in a map (List of Lists containing anagrams grouped together)
         */
        
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
	
}
