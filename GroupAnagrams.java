import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(Nk) where N is the number of strings and k is the length of string
// Space Complexity : O(N) - worst case when each of N strings is unqiue
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Use Hashing to group anagrams.
* */
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();

        HashMap<HashMap<Character,Integer>, ArrayList<String>> resultMap=
                new HashMap<>();
        for(String str: strs){
            HashMap<Character,Integer> charMap= new HashMap<>();
            for(char ch: str.toCharArray()){
                charMap.put(ch, charMap.getOrDefault(ch,0)+1);
            }

            ArrayList<String> list= resultMap.getOrDefault(charMap,
                    new ArrayList<String>());
            list.add(str);
            resultMap.put(charMap, list);
        }

        return new ArrayList(resultMap.values());
    }
}