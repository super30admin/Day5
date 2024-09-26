package com.s30.satish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
	        if(strs == null || strs.length == 0)
	        	return new ArrayList<>();
	        
	        HashMap<String, List<String>> map = new HashMap<>(); 
	        
	        for(String s : strs)
	        {
	        	char[] charArray = s.toCharArray();
	        	Arrays.sort(charArray);
	        	String sortValue = String.valueOf(charArray);
	        	
	        	if(!map.containsKey(sortValue))
	        		map.put(sortValue, new ArrayList<>());
	        	map.get(sortValue).add(s);
	        }
	        
	        return new ArrayList<>(map.values());
	    }
	
	public static void main(String[] args)
	{
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		Group_Anagrams angramsObj = new Group_Anagrams();
		List<List<String>> returnList = angramsObj.groupAnagrams(strs);
		
		System.out.println(returnList);
	}

}
