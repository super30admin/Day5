//Time Complexity: O(NK log K) where N is the number of Strings in the String array and K is the length of each string.
//Space Complexity: O(NK) 

//Brute Force: To compare each string with every other string and check if they are anagrams to one another

//Optimized: We will make use of a HashMap to store the keys which are the sorted strings of every string. Two strins are anagrams
//if their sorted string is same (i.e. the key is same) and these strings will be stored corresponding to the key in 
//a newly created list. We will return the list of all anagrams in the end.

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        HashMap<String,List> hmap = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char[] strCharArr = strs[i].toCharArray();
            Arrays.sort(strCharArr);
            String key = String.valueOf(strCharArr);
            if(!hmap.containsKey(key))
            {
                List<String> newList = new ArrayList<>();
                hmap.put(key, newList);
            }
            hmap.get(key).add(strs[i]);
        }       
        return new ArrayList(hmap.values());
     }
}