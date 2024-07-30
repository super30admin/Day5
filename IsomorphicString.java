//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t){
        return returnIsIsomorphic(s,t) && returnIsIsomorphic(t,s);
    }
    public static boolean returnIsIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar)){
                map.put(sChar, tChar);
            }
            else{
                if(map.get(sChar)!=tChar){
                    return false;
                }
            }

        }

        return true;

    }

    public static void main (String[] args){
        boolean result = isIsomorphic("egg", "add");
        System.out.println(result);
    }

}
