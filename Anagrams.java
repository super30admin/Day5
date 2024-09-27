package s30Coding;
import java.util.*;


// Time Complexity :- O(n) - Each string is traversed once throughout the function

// Space Complexity :- O(2n) if considered the returning ArrayList(auxiliary space) else it will be O(n) is only considered for HashMap.

// Leet Code Successfully executed :- Yes

// Logic :- Traverse through the i/p array. Sort each string by characters and check if it already present in the hashmap,
//			If not, put the sorted string as the and create an new ArrayList as its value.
//			Add the original string to the existing arrayList of the sorted string key's ArrayList.
//			Return all the ArrayList values in the hashmap.

public class Anagrams {
	public List<List<String>> findAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<String>());   
            }
            map.get(str).add(s);
        }
        
        List<List<String>> result = new ArrayList<>();
        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}
