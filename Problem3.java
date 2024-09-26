package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given a pattern and a string , find if the string follows the pattern or not.
Here follow means a full match, such that there is a bijection between a letter in
 pattern and a non-empty word in str.
Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains
 lowercase letters that may be separated by a single space.
 
 Complexity 
 Time:O(n)
 Space:O(2n)
*/
public class Problem3 {
	
	public static boolean patternfollow(String pattern,String s) {
		Map<String,Character>map= new HashMap<String,Character>();
		Set<Character>  set = new HashSet<Character>();
		char[] a = pattern.toCharArray();
		String[] str=s.split(" ");
	
	
	
		for(int i=0;i<str.length-1;i++) {
			if(map.containsKey(str[i])) {
				if(map.get(str[i])!=(a[i])) {
					return false;
				}
			}else {
				if(set.contains(a[i])) return false;
				map.put(str[i],a[i]);
				set.add(a[i]);
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		String p="abba";
		String str="dog cat fish dog";
		boolean res= patternfollow(p,str);
		System.out.println(res);
	}

}
