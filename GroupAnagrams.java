/**
 * @author Vishal Puri
 * // Time Complexity : O(Nlogn)    As we are sorting the character array in the loop
 * // Space Complexity : O(n)   As algorithm uses an auxiliary map which stores all the strings
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this : No
 */

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            char[] ca =strs[i].toCharArray();
            Arrays.sort(ca);    //O(logn)
            String sortedS = new String(ca);
            if(map.containsKey(sortedS)){
                map.get(sortedS).add(temp);
            } else{
                List<String> temp2 = new ArrayList<String>();
                temp2.add(temp);
                map.put(sortedS,temp2);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            out.add(entry.getValue());
        }
        return out;
    }
}
