import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(!map.containsKey(s.charAt(i))){
                if(tSet.contains(t.charAt(i))){
                    return false;
                }else{
                    map.put(s.charAt(i), t.charAt(i));
                    tSet.add(t.charAt(i));
                }

            }else if(t.charAt(i) != (map.get(key))){
                return false;
            }
        }
        return true;
    }
}
