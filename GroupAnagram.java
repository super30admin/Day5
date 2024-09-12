import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

//TIME COMPLEXITY O(nklogk) I did not understand
//space complexity o(nk) ) I did not understand

//leetcode Reference 49. Group Anagrams
public class GroupAnagram {
	
	
	    public static  List<List<String>> findGroupAnagrams(String[] strs) {
	        if (strs.length == 0) return new ArrayList();
	        Map<String, List> ans = new HashMap<String, List>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String key = String.valueOf(ca);
	            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
	            ans.get(key).add(s);
	        }
	        return new ArrayList(ans.values());
	    }
	
	    
	    public static void main (String[] args) 
		{ 
	    	String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
	    	List<List<String>>  res = findGroupAnagrams(strs); 
			System.out.println(res); 
		
			
		}
	    

}
