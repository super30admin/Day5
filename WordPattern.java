import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] splited = s.split(" ");
        if(pattern.length() != splited.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(!set.contains(splited[i])) {
                    map.put(pattern.charAt(i), splited[i]);
                    set.add(splited[i]);
                }
                else {
                    return false;
                }
            } else {
                if(!map.get(pattern.charAt(i)).equals(splited[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
