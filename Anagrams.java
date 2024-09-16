// Time Complexity : O(N k log k) where N is length for strings array given and K is maximum size of each string. 
// Space Complexity : O(NK) since N strings and each string has maximum K characters -- stored in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
//    List<List<String>> result = new ArrayList<List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs==null || strs.length==0){ return new ArrayList<List<String>>();}

        //logic : we are using sorting the strings internally char by char so that comparision is easier between anagrams
        //HashMap to store the key (sorted char array of each string) and it's identified anagrams
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str:strs){
            char[] charArray = str.toCharArray(); //Converting into char array
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if(map.containsKey(key)){ //Case 1: exists in map already
                map.get(key).add(str);
            }
            else{
                map.put(key, new ArrayList<String>()); //Case 2: new to the map and so we add it now.
                map.get(key).add(str);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String... args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = new Anagrams().groupAnagrams(strs);
        for(List<String> stringList: result){
            System.out.println("Grouped together");
            for(String str: stringList){
                System.out.print(str + " ");
            }
        }
    }
}
