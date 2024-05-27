import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null && s == null){
            return true;
        }

        if(pattern == null || s == null){
            return false;
        }

        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length){
            return false;
        }

        HashMap<Character, String> pMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            char current = pattern.charAt(i);
            if(pMap.containsKey(current)){
                if(!pMap.get(current).equals(sArray[i])){
                    return false;
                }
            } else {
                pMap.put(current, sArray[i]);
                if(set.contains(sArray[i])){
                    return false;
                }
                set.add(sArray[i]);
            }

        }

        return true;
    }

    public boolean wordPattern2(String pattern, String s) {
        if(pattern == null && s == null){
            return true;
        }

        if(pattern == null || s == null){
            return false;
        }

        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length){
            return false;
        }

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char current = pattern.charAt(i);
            if(pMap.containsKey(current)){
                if(!pMap.get(current).equals(sArray[i])){
                    return false;
                }
            } else {
                pMap.put(current, sArray[i]);
            }
            if(sMap.containsKey(sArray[i])){
                if(sMap.get(sArray[i]) != current){
                    return false;
                }
            } else {
                sMap.put(sArray[i], current);
            }
        }

        return true;
    }

    public static void main(String[] str){
        WordPattern object =  new WordPattern();
        boolean ans = object.wordPattern("abba", "dog cat cat dog");

        System.out.println(ans);
    }
}
