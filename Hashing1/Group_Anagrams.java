package Solution;
import java.util.*;

public class Group_Anagrams {
	public static List<List<String>> parentlist;
	private static List<List<String>> groupAnagrams(String[] strs){
		parentlist = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
       
        for(String s  : strs){
            char[]arr =  s.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
        
        if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<String>());
            map.get(sorted).add(s);
        }
        
            else map.get(sorted).add(s);
            
        }
        parentlist.addAll(map.values()); 
        return parentlist;
}
        public static void main(String args[]){
        	String strs[] = new String[]{"eat","tea","tan","ate","nat","bat"}; 
        	groupAnagrams(strs);
        	
        	for(List<String> str : parentlist ){
        		System.out.print(str + " ");
        	}
        }

}
