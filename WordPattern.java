import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();

        HashSet<String> str = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++){
            char key = pattern.charAt(i);
            if(!map.containsKey(pattern.charAt(i))){
                if(str.contains(words[i])){
                    return false;
                }else{
                    map.put(pattern.charAt(i), words[i]);
                    str.add(words[i]);
                }

            }else if(!words[i].equals(map.get(key))){
                return false;
            }
        }
        return true;

    }
}
