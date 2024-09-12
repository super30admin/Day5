// Time Complexity : foreach - O(N), put - O(1), Get - O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class Main {

    public static void main(String[] args) {				// main function
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
		
        if (strs.length == 0) {			// if string length is 0, return empty list
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();		// HashMap declaration

        for (String s : strs) {					// traversing through each string element
            char[] ca = s.toCharArray();		// convert into a character array
            Arrays.sort(ca);					// sort it according to their precedence
            String key = String.valueOf(ca);	// key is generated for the hashmap	
            if (!ans.containsKey(key)) {		// if the key is not present, insert a new arraylist to the key
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);				// if found, add the string to the key
        }
        return new ArrayList(ans.values());		// return the final arraylist of lists.
    }
}
