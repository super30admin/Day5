
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class GroupAnagram {

	//Time complexity : o(nklogk) where n is number of words and kis the length of each word.
	//klogk comes because we are sorting each word
	//executed on leetcode : yes
	//approach : 1. Iterate throughtout the array,
	            //store sorted values of each word as key in the hashmap.
	///since anagram are words which would yield same result on sorting their character , we see 
	//for each word if the sort of that word is present as key in the hashmap
	
	

	//if the sort of that word is present as key, we add the word to the value of that key or in else case, we create a new key value pair in the hashmap
	public static void main(String[] args) {
		  String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
	        System.out.println("group anagrams are: "+ findGroupAnagram(input)); 

	}
	public static List<List<String>> findGroupAnagram(String[] input){
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for(String s:input)
		{
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String sorted = String.valueOf(c);
			if(!map.containsKey(sorted)) {
				map.put(sorted,  new ArrayList<String>());
				map.get(sorted).add(s);
			}
			else
				map.get(sorted).add(s);
		}
		return new ArrayList<List<String>>(map.values());
		
	}

}
