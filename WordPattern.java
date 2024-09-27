import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s){
        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        String[] strs = s.split(" ");

        if(pattern.length() != strs.length){
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++){
            char current = pattern.charAt(i);
            if(hm.containsKey(current)){
                if(!strs[i].equals(hm.get(current))){
                    return false;
                }

            }
            else{
                hm.put(current, strs[i]);
                if(hs.contains(strs[i])){
                    return false;
                }
                else{
                    hs.add(strs[i]);
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
    }
}
