package Trees_Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bijection {
	
public static boolean helper(String pattern, String str) {
		
		String [] strArray = str.split(" ");
		
		if(pattern.length() != strArray.length)
		{
			return false;
		}
		
		Map<Character, List<String>> map = new HashMap<>();
		
		for(int i = 0 ; i<pattern.length() ; i++)
		{
			if(!map.containsKey(pattern.charAt(i)))
			{
				map.put(pattern.charAt(i), new ArrayList<String>(Arrays.asList(strArray[i])));
				
			}
			else if(map.get(pattern.charAt(i)).contains(strArray[i]))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String pattern = "aaaa";
		String str = "dog cat cat dog";
		System.out.println(helper(pattern,str));
	}

}
