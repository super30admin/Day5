import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Anagrams {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            
            char[] temp = strs[i].toCharArray();

            Arrays.sort(temp);

            String current = new String(temp);

            if(hm.containsKey(current)){
                List<String> te = hm.get(current);
                te.add(strs[i]);
                hm.put(current, te);
            }
            else{
                
                hm.put(current, new ArrayList<>());
                List<String> te = hm.get(current);
                te.add(strs[i]);
                hm.put(current, te);
            }
        }
        return new ArrayList(hm.values());
    }
}
