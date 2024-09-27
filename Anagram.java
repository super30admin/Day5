//timecomplexity: nklogk
//space complexity: nk
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Anagram {

        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map= new HashMap<>();
            for (String s: strs)
            {
                char [] charArr= s.toCharArray();
                Arrays.sort(charArr);
                String sorted= String.valueOf(charArr);
                if(!map.containsKey(sorted))
                {
                    map.put(sorted, new ArrayList<>());
                }
                    map.get(sorted).add(s);
                
            }
            return new ArrayList<>(map.values());
            
        }
    
    
}
