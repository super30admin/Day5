/*
 * We  use hashMap to store the sorted input string as key and 
 * add all the anagrams which give same key when sorted.
 * we use hashmap because it's search is O(1)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        var hash=new HashMap<String,List<String>>();
        // space n*l
        for(String s:strs) //O(n). nlogl
        {
            char[] c=s.toCharArray();//l
            Arrays.sort(c);           //llog(l)
            String temp=String.valueOf(c);
            if(!hash.containsKey(temp)){//l
                hash.put(temp,new ArrayList<>());
            }                      
            hash.get(temp).add(s);
            
        }
        return new ArrayList<>(hash.values());

    }
}
