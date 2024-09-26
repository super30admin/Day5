import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash=new HashMap<>();
        for(String str: strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);
            if(!hash.containsKey(sorted)){
                hash.put(sorted,new ArrayList<>());
            }
            hash.get(sorted).add(str);
        }
        return new ArrayList(hash.values());
    }
}