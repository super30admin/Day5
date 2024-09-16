package com.Aug2020.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :
// logic behind this was bit tricky to formulate.
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		int first = 0;
		List<String> data = null;
		List<List<String>> parent = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		boolean flag = false;
		for (int j = 0; j < strs.length; j++) {
			char[] arr = strs[j].toCharArray();
			Arrays.sort(arr);
			String sort = new String(arr);
			if (!map.containsKey(sort)) {
				System.out.println(sort);
				map.put(sort, new ArrayList<String>());
			}
			map.get(sort).add(strs[j]);
		}

		/*
		 * for (int j = 0; j < strs.length; j++) { data = new ArrayList<String>(); for
		 * (int i = 0; i < strs.length; i++) { flag = false; int start = 0; int end =
		 * strs[i].length() - 1; int count = 0; while (start < end && i != j) {
		 * System.out.println(strs[j].indexOf(strs[i].charAt(start)) + " char => " +
		 * strs[i].charAt(start)); if (strs[j].indexOf(strs[i].charAt(start)) != -1) {
		 * 
		 * count++; }
		 * 
		 * 
		 * start++; end--; } System.out.println(" count => " + count + " len => " +
		 * strs[i].length()); if (count == strs[i].length() - 1) { data.add(strs[i]);
		 * 
		 * flag = true; }
		 * 
		 * } if (flag) { data.add(strs[j]); }
		 * 
		 * 
		 * parent.add(data); }
		 */
		parent.addAll(map.values());
		return parent;
	}
}
