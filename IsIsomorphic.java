/**
 * @author Vishal Puri
 * // Time Complexity : O(n)    Where n is the sum of lengths of both string s and t
 * // Space Complexity : O(n)   As algorithm uses an auxiliary map which stores all the strings
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this : No
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> map1 = new HashMap<>();
        Map<Character, List<Integer>> map2 = new HashMap<>();
        map1 = getMap(s);
        map2 = getMap(t);
        for(Map.Entry<Character, List<Integer>> entry : map1.entrySet()){
            if(!map2.containsValue(entry.getValue()))
                return false;
        }
        return true;
    }

    public Map<Character, List<Integer>> getMap(String s){
        Map<Character, List<Integer>> map = new HashMap<>();
        char[] ca = s.toCharArray();
        for(int i=0; i<ca.length;i++){
            if(map.containsKey(ca[i]))
                map.get(ca[i]).add(i);
            else{
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                map.put(ca[i], ls);
            }
        }
        return map;
    }
}
