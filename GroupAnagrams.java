import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Created a Hashmap of sorted string as key and arraylist of strings as values
// and then appended all the values of the hashmap in a List of Arraylist of Strings


public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, ArrayList<String>> hm = new HashMap<>();
            for(String s: strs){
                char[] ss = s.toCharArray();
                Arrays.sort(ss);

                String sorted = String.valueOf(ss);
                if(!hm.containsKey(sorted)){
                    ArrayList<String> al = new ArrayList<>();
                    al.add(s);
                    hm.put(sorted, al);
                }else{
                    ArrayList<String> al = hm.get(sorted);
                    al.add(s);
                    hm.put(sorted, al);
                }
            }
            List<List<String>> all = new ArrayList<>();
            for(String s : hm.keySet()){
                all.add(hm.get(s));
            }
            return all;
        }
}
