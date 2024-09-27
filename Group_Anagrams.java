import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
		 //Approach: 1. Here am taking a hashmap, for every string that i come across, I convert them into char array, sort it and form a new string which acts as key.
		 //2.For values, which ever string has the same key will be put together in a list of strings.
		 //3. finally, iterating the hashmap and returning the values list.
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        List<List<String>> result = new ArrayList<List<String>>();
	        for(int loop=0;loop<strs.length;loop++)
	        {
	            char[] charArray = strs[loop].toCharArray();
	            Arrays.sort(charArray);
	            String s = new String(charArray);
	            if(map.containsKey(s))
	            {
	                List<String> list = map.get(s);
	                list.add(strs[loop]);
	                map.put(s,list);
	            }else
	            {
	                List<String> list = new ArrayList<String>();
	                list.add(strs[loop]);
	                map.put(s,list);
	            }
	        }
	        for(Map.Entry<String, List<String>> entry: map.entrySet())
	        {
	            result.add(entry.getValue());
	        }
	        return result;
	    }
}
//Time Complexity : O(n log k), for sorting it takes nlogk and for iterating through list, its O(n). 
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
