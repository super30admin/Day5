/*
Time complexity O(Nklogk)
Space Complexity O(Nk)
where k is the average length of anagram
N is the number of anagrams
*/
import java.util.Arrays;
import java.util.*;
class Solution {
    HashMap <String,ArrayList<String>> h=new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
       for(String str:strs){
        	char[] xy=str.toCharArray();
        	Arrays.sort(xy);
           String sortedvalue=new String(xy);
        if(h.containsKey(sortedvalue)) {
        h.get(sortedvalue).add(str);
        }
        else {
        	h.put(sortedvalue, new ArrayList<String>(Arrays.asList(str)));
        }
    }
        return new ArrayList<>(h.values());
        
}
}