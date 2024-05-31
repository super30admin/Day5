import java.util.HashMap;
import java.util.Map;

//time - O(n)
//space - O(n)
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length()==0 || s == null || s.length()==0) return false;

        Map<Character,String> pmap = new HashMap<>();
        Map<String, Character> smap = new HashMap<>();

        String[] strs = s.split(" ");

        if(pattern.length() != strs.length) return false;

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);

            if(pmap.containsKey(ch)){
                if(!pmap.get(ch).equals(strs[i])) return false;
            } else {
                pmap.put(ch, strs[i]);
            }

            if(smap.containsKey(strs[i])){
                if(smap.get(strs[i]) != ch) return false;
            } else {
                smap.put(strs[i], ch);
            }
        }

        return true;
    }
}
