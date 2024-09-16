// Time Complexity : O(n*k*logk) where n is the number of strings and k is the average length of strings,
// klogk is to sort the array characters of a string
// Space Complexity : O(n*k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was able to think through the logic but wasn't able to code it until the
// class

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = String.valueOf(strArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());

            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
        // Time complexity is O(N*K*LOGK);
    }

    public static void main(String[] args){
        GroupAnagrams ga = new GroupAnagrams();
        String [] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(strs));
    }
}


