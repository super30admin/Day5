//Time Complexity: O(n2) => o(n) for hashing and o(n) for iterating all elements
// Space Complexity: O(n) => Creation of Map
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String s, String str) {
        Map<Character,String> map = new HashMap<>();
        String[] t = str.split(" ");
        //Spliting string wrt space and then adding as the value corresponding to the character and checking wrt each character if the pattern is followed
        if(s.length() == t.length){
            for(int i=0;i<s.length();i++){
                if(!map.containsKey(s.charAt(i))){
                    if(map.containsValue(t[i]))
                        return false;
                    map.put(s.charAt(i) , t[i]);
                }
                else if(!map.get(s.charAt(i)).equals(t[i])){
                    return false;
                }     
                // System.out.println(map);
            }

            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat dog cat"));
    }
}