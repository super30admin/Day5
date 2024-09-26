
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

	

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();

		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == null)
				continue;
			List<String> temp = new ArrayList<String>();

			temp.add(strs[i]);
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[j] != null && isAnagram(strs[i], strs[j])) {
					temp.add(strs[j]);
					strs[j] = null;
				}
			}

			result.add(temp);
		}

		return result;
	}

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] ana = new int[26];
		Arrays.fill(ana, 0);
		for (int i = 0; i < s.length(); i++)

		{
			char c = s.charAt(i);
			char ch = t.charAt(i);
			ana[c - 'a']++;
			ana[ch - 'a']--;

		}

		for (int j = 0; j < ana.length; j++)
			if (ana[j] != 0)
				return false;

		return true;
	}
}

	// Brute Force approach
	// Time Complexity: O(n*n*k)
	// Space Complexity: O(n) 
