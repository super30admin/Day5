package GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();

        for(String s:strs){
            char[] temp  = s.toCharArray();
            Arrays.sort(temp);
            String temp2 = new String(temp);
            if(result.containsKey(temp2)){
                List<String> addString = result.get(temp2);
                addString.add(s);
                result.put(temp2,addString);
            }else{
                List<String> val = new ArrayList<>();
                val.add(s);
                result.put(temp2,val);
            }
        }

        List<List<String>> finalResult =  new ArrayList<>();
        for(Map.Entry<String,List<String>> entry :result.entrySet() ){
            finalResult.add(entry.getValue());
        }

        return finalResult;
    }
}
