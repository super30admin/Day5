package demo;

import java.util.*;

public class GroupingAnagrams {
	
	//	Time:  O(n) 
	//	Space O(n) no dp matrix
	//	LeetCode: yes

	public List<List<String>> groupAnagrams(String[] strs) {
		//maping the characters
		HashMap <String,List<String>> map = new HashMap<>();
		for(int i = 0; i < strs.length; i++){
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String s = String.valueOf(c);
			if(!map.containsKey(s)){
				map.put(s, new ArrayList<String>());
			}
			map.get(s).add(strs[i]);
		}
		return new ArrayList<List<String>>(map.values());
	}
}
