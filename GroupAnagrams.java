import java.util.*;

//time - O(n*k) - n is the number of strings and k is the avg length of each string
//space - O(1)
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] arr = new int[26];
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                arr[ch-'a']++;
            }

            String key = Arrays.toString(arr);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
