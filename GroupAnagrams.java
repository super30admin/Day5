import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {         
        
        HashMap<String, List<String>> h = new HashMap<>();

        for (String s:strs){
            
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);

            if (!h.containsKey(sorted)){
                h.put(sorted, new ArrayList<String>());
            }
            h.get(sorted).add(s);
        }
        return new ArrayList<>(h.values());
    }
}