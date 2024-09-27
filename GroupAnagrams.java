// Time Complexity : O(n) + O(klog(k)) // For number of Strings + Sorting the String characters
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

public class GroupAnagrams {

    // Putting sorted string as a key and other strings as a list of values
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            String newStr = sortStringCharacters(s);
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<String>());
            }
            map.get(newStr).add(s);
        }

        return new ArrayList<>(map.values());
    }

    // Function to sort characters in a string
    public static String sortStringCharacters(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String args[]){
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
