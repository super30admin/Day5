//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hashMap = new HashMap<>();
        String[] stringValue = s.split(" ");
        if(pattern.length()!=stringValue.length){
            return false;
        }

        for(int i = 0; i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c , stringValue[i]);
            }
            else{
                if(!hashMap.get(c).equals(stringValue[i])){
                    return false;
                }
            }
        }

        HashMap<String, Character> map = new HashMap<>();
        String[] splitString = s.split(" ");

        for(int i = 0; i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(splitString[i])){
                map.put(splitString[i], c);
            }
            else{
                if(!map.get(splitString[i]).equals(c)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        boolean result = wordPattern("abba", "dog cat cat dog");
        System.out.println(result);
    }
}
