import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
          
        for(int item = 0;item<strs.length; item++){
            char[] citem = strs[item].toCharArray();
            Arrays.sort(citem);
            String sorted = String.valueOf(citem);
            if(!hm.containsKey(sorted))
            {
            	hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(strs[item]);
        }
        return new ArrayList<>(hm.values());
    }
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(GroupAnagrams.groupAnagrams(strs));
	}
	
}
