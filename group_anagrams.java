import java.util.*;
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(int i=0;i < strs.length;i++){
            String s = strs[i];
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedStr = String.valueOf(sArray);
            if(!hashMap.containsKey(sortedStr)){
                hashMap.put(sortedStr,new ArrayList<>());
            }
            hashMap.get(sortedStr).add(s);



        }
       return new ArrayList<>(hashMap.values()); 
    }
}