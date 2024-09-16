import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainlist = new ArrayList<List<String>>();
        HashMap<String,List<String>> map1 = new HashMap<String,List<String>>();
        for(String s : strs){
            char[] x = s.toCharArray();
            Arrays.sort(x);
            String key = String.valueOf(x);
            if(!map1.containsKey(key)){
                List<String> temp = new ArrayList<String>();
                temp.add(s);
                map1.put(key,temp);
            }
            else
                map1.get(key).add(s);
        }
        mainlist.addAll(map1.values());
        return mainlist;
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
