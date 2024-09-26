import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length ; i++){
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String sortedArr = String.valueOf(cArr);
            if(!map.containsKey(sortedArr)){
                map.put(sortedArr, new ArrayList<>());
            }
            map.get(sortedArr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        System.out.println( groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

}

