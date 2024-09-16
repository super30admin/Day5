// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
class Problem1 {
    public static void main(String args[]) {
        String[] anagram = {"eat","tea","tan","ate","nat","bat"}; 
        System.out.println(groupAnagrams(anagram));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a hash Map of list of Strings
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();
        // create a list of list of string to store the result
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            // sort the string
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            // check if value is present after sorting
            if (map.containsKey(sorted)) {
                // add the string to the existing list which matches the sorted string
                map.get(sorted).add(strs[i]);
            }
            else {
                // if the sorted string did not appear add in hashmap
                List<String> ch = new ArrayList<String>();
                ch.add(strs[i]);
                map.put(sorted,ch);
            }
        }
    // iterate through hashmap to retrieve the list associated    
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        result.add((List<String>)pair.getValue());
    }
        return result;
    }
}