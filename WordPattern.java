import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] patternArray = pattern.toCharArray();
        String[] strArray = s.split(" ");
        HashMap<Character, String> sourceMap = new HashMap<>();
        HashSet<String> targetSet = new HashSet<>();
        if(patternArray.length !=  strArray.length){
            return false;
        } else {
            for(int i=0; i<patternArray.length; i++){
                if(!sourceMap.containsKey(patternArray[i])){
                    if(targetSet.contains(strArray[i])){
                        return false;
                    } else {
                        sourceMap.put(patternArray[i],strArray[i]);
                        targetSet.add(strArray[i]);
                    }
                } else {
                    if(!strArray[i].equals(sourceMap.get(patternArray[i]))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
