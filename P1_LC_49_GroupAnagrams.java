import java.util.*;
import java.io.*;

public class P1_LC_49_GroupAnagrams {
	public static void main(String[] args) {
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println("Output: "+ groupAnagrams(str));
	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String,List<String>> map = new HashMap<>();
	        
	        for(int i =0; i<strs.length; i++){
	            char[] c = strs[i].toCharArray();
	            Arrays.sort(c);
	            String sortedStr= String.valueOf(c);
	            
	            if(!map.containsKey(sortedStr)){
	                map.put(sortedStr, new ArrayList<String>());
	            }
	            map.get(sortedStr).add(strs[i]);
	        }
	        
	     return new ArrayList<List<String>>(map.values());
	    }
}
