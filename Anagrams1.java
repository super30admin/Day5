import java.util.*;

public class Anagrams1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){//n
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);//klogk
            String str = new String(charArray);

            map.putIfAbsent(str, new ArrayList<>()); //k
            map.get(str).add(s);
        }
        return new ArrayList(map.values());
    }
}
/**Time Complexity -> n(klogk) */