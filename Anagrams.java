// Time Complexity : O(N*K*log K), where N is the number of token, K is length of longest token
// Space Complexity : O(N*K) where N is the number of token, K is length of longest token
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class Anagrams{

    public List<List<String>> Anagrams(String[] strs){
        //edge
        if (strs == null || strs.length == 0){
            return new ArrayList<List<String>>();
        }
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs){ //Search each token s
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c); //Sorted string of token
            if(!map.containsKey(str)){ // if key not found put the sorted string and create a new ArrayList as its value
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(s); //s is token
        }
        return new ArrayList<List<String>>(map.values());
    }

}