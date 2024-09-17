import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */

//Here we can apply quicksort to all the strings in the string array.
//The string can be of size N so the time complexity would be NlogN and the string array would be of size M.
//So the total time complexity of MNLogN

//So the whole of string array would be traversed and all strings will be stored.So space complexity would be O(MN)

public class String_anagrams {

	/**
	 * @param args
	 */
	
	public static List<List<String>> get_anagrams(String[] strs){
		
		if(strs.length == 0) {return new ArrayList();}
		
		Map<String,List> map = new HashMap<String,List>();
		List<String> arr = new ArrayList<String>(); 
		for(String s:strs) {
			
			char[] char_array = s.toCharArray();
			Arrays.sort(char_array);
			
			String key = String.valueOf(char_array);
			
			if(!map.containsKey(key)) 
			{
				map.put(key, new ArrayList());
			
			}
			map.get(key).add(s);
			
		}
		
		return new ArrayList(map.values());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"eat", "tea", "tan", "ate", "nat", "hat"};
		List<List<String>> anagrams = get_anagrams(words);
		System.out.println(anagrams);
	}

}
