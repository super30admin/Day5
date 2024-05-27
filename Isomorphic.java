import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                sMap.put(sChar, tChar);
                if(tSet.contains(tChar)){
                    return false;
                }
                tSet.add(tChar);
            }

        }


        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                sMap.put(sChar, tChar);
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            } else{
                tMap.put(tChar, sChar);
            }
        } 


        return true;
    }
    public static void main(String[] strs){
        Isomorphic object = new Isomorphic();
        boolean ans = object.isIsomorphic("egg", "add");
        System.out.println(ans);
    }
}
