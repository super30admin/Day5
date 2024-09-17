import java.util.*;
public class GroupAnagarams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String current : strs ){
            char[] s = current.toCharArray();
            Arrays.sort(s);
            String key = String.valueOf(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(current);

        }
        result.addAll(map.values());
        return result;
    }
    public static  void main(String args[]){
        GroupAnagarams o = new GroupAnagarams();
        String [] strs = { "eat", "ate", "tea", "nat","tan","bat"};
        System.out.println(o.groupAnagrams(strs));
    }
}
