package day5;

import java.util.*;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> res = new ArrayList<>();
	    HashMap<String, List<String>> map = new HashMap<>();
	    
	    Arrays.sort(strs);
	    for (int i = 0; i < strs.length; i++) {
	    	String temp = strs[i];
	    	char[] ch = temp.toCharArray();
	    	Arrays.sort(ch);
	    	if (map.containsKey(String.valueOf(ch))) {
	    		map.get(String.valueOf(ch)).add(strs[i]);
	    	} else {
	    		List<String> each = new ArrayList<>();
	    		each.add(strs[i]);
	    		map.put(String.valueOf(ch), each);
	    	}
	    }
	    for (List<String> item: map.values()) {
	    	res.add(item);
	    }
	    return res;
	}
	
	public static void main(String args[]) 
    { 
        String strArray[] = { "cat", "dog", "tac", "god", "act" }; 
        System.out.println(groupAnagrams(strArray)); 
    }
}
