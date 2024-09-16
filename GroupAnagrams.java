// Time Complexity :O(nklogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
    //https://leetcode.com/problems/group-anagrams/
// Any problem you faced while coding this : no
//Aproach : Sorted the String and used it as key to store all the anagrams


import java.util.*;

// Your code here along with comments explaining your approach
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            List l = map.getOrDefault(sortedStr, new ArrayList<String>());
            l.add(str);
            map.put(sortedStr, l);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = g.groupAnagrams(strs);
        for (List<String> s: res) {
            System.out.println(s);
        }
    }
}