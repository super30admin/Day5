package Trees_Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Anagrams {
	
	public static List<Set<String>> helper(String [] arr)
	{
		List<Set<String>> list = new ArrayList<>();
		
		if(arr.length == 0 || arr == null)
		{
			return list;
		}
		
		List<Integer> indexList = new ArrayList<>();
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			Set<String> set = new HashSet<>();
			if(indexList.contains(i))
				continue;
			set.add(arr[i]);
			for(int j = i+1; j<arr.length ; j++)
			{
				if(checkAnagrams(arr[i], arr[j]))
				{
					set.add(arr[j]);
					indexList.add(j);
				}
			}
			
			list.add(set);
		}
		
		return list;
	}
	
	public static boolean checkAnagrams(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		Set<Character> set = new HashSet<>();
		
		for(int i = 0 ; i<str1.length() ; i++)
		{
			set.add(str1.charAt(i));
			set.add(str2.charAt(i));
		}
		
		if(set.size() == str1.length())
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String [] arr  = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(helper(arr));
	}
	
}