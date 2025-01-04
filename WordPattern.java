//TC: O(n)
//SC: O(n) where n is length of pattern
//approach: using hashmap to map pattern to words in string,
// and hashset to keep record of what words are already mapped

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pmap = new HashMap<Character, String>();
        HashSet<String> wset = new HashSet<>();
        String[] inputString = s.split(" ");
        if (pattern.length() != inputString.length) return false;

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = inputString[i];
            if(!pmap.containsKey(c)){
                if(wset.contains(word)) return false;
                pmap.put(c, word);
            }else if(!Objects.equals(pmap.get(c), word)) return false;

            wset.add(word);
        }
        return true;
    }
}
