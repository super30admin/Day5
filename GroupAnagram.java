//TimeComplexity : O(nmlogm)
//SpaceComplexity: O(n)
import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String string = new String(c);
            if(!hashMap.containsKey(string)){
                List<String> list = new ArrayList<>();
                list.add(s);
                hashMap.put(string, list);
            }
            else{
                hashMap.get(string).add(s);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : hashMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args){
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println(list);
    }
}
