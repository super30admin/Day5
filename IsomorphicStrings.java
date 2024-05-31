import java.util.HashMap;
import java.util.Map;

//time - O(n)
//space - O(n)
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null || s.length()!=t.length()) return false;

        Map<Character,Character> smap = new HashMap<>();
        Map<Character,Character> tmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(smap.containsKey(sChar)){
                if(smap.get(sChar) != tChar) return false;
            } else {
                smap.put(sChar, tChar);
            }

            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar) != sChar) return false;
            } else {
                tmap.put(tChar, sChar);
            }
        }

        return true;
    }
}
