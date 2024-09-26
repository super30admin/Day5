package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.
 * 
 * */
public class Problem1 {

	
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<String,List<String>> map = new HashMap<String,List<String>>();
		 int[] val= new int[26];
		 
		
		 for(String str : strs) {
			 Arrays.fill(val, 0);
			 for(char c : str.toCharArray()) {
				 val[c-'a']++;
			 }
			 StringBuilder sb = new StringBuilder();
			 for(int i=0;i<str.length();i++) {
				 sb.append("");
				 sb.append(val[i]);
			 }
			 
			 String s = sb.toString();
			 if(!map.containsKey(s)) {
				 map.put(s, new ArrayList<>());
			 }
			 
			 map.get(s).add(str);
			 
		 }
		 
		 
		return new ArrayList<>(map.values());
		 
	 }
	
	public static void main(String[] args) {
		String[] str = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res= groupAnagrams(str);
		System.out.println(res);
	}
}
