
// Time Complexity is O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.
 
 
 */



public class AnagramGrouping {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs.length == 0) return new ArrayList();  // if the string is empty return null array list
        
        Map<String, List> ans = new HashMap<String, List>();
        
        //idea is to loop all the strings  and converst the given string into char array. 
        // and sort the chars to store in the map.  and  store the values for another same type of strings in the map  as values for the key.
        
        
        for (String s : strs) {  
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramGrouping ag = new AnagramGrouping();
		String[] strs ={"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ag.groupAnagrams(strs ));
	}

}
