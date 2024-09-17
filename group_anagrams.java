// /* Time complexity: O(NK) where N is number of strings in array and K is the strings maximum length/
// Space Complexity: O(K) where K is the length of information stored in ArrayList.

// First We will consider each string, count the values of each character in the string and add a preceding "#" to the string. This way, we can store
// a unique pattern for the each string, "abc" -> #1#2#3#0#0#0#0#0....(26) . IF we already have this type of pattern for a string,
// we will add that string in our final array list and return the result

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class group_anagrams {
	
	public List<List<String>> groupanagram(String[] arr){
		//Edge cases
		if(arr== null || arr.length==0)
			return new ArrayList();
		HashMap<String, List> map = new HashMap();
		int[] cnt = new int[26];
		for(String x: arr) {
			Arrays.fill(cnt, 0);
			char[] x1 = x.toCharArray();
			
			for(char c: x1) {
				cnt[c-'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<26;i++) {
				sb.append("#");
				sb.append(cnt[i]);
			}
			String ca = String.valueOf(sb);
			if(!map.containsKey(ca))
			{
				map.put(ca, new ArrayList());
			}
			map.get(ca).add(x);
		}
		return new ArrayList(map.values());
		
	}
	
	public static void main(String[] args) {
		group_anagrams ga = new group_anagrams();
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ga.groupanagram(str));
	}

}
