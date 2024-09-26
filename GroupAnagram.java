// Time Complexity : O(nlog(n)+O(n))=> O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> newMap=new HashMap<>();
        if(strs==null || strs.length==0)
            return new ArrayList<>();
        
        for(String s:strs){
         
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);
            if(!newMap.containsKey(sorted)){
                newMap.put(sorted,new ArrayList<>());
                }
            newMap.get(sorted).add(s);
            
        }
        return new ArrayList<>(newMap.values());
        
    }
}