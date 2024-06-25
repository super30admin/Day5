import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        int sl = s.length(); int tl = t.length();
        for(int i=0; i<sl; i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar)) { //if character from source string was already encountered
                if(smap.get(schar) != tchar) return false; //if the corresponding character from target string is not the same
            } else { //else if the character from source string is encountered
                if(tset.contains(tchar)) return false; // but corresponding character from target already exists / is mapped to another character
                smap.put(schar, tchar); //if one-one mapping is found
                tset.add(tchar); //if this is the first time target character is encountered
            }
        }
        return true; // if all the checks pass, then it is isomorphic
    }

    public static void main(String[] args) {
        String s1 = "ababa";
        String t1 = "xoxox";
        String s2 = "nitin";
        String t2 = "kumar";
        System.out.println(s1 + " and " + t1 + " are isomorphic: " + isIsomorphic(s1, t1));
        System.out.println(s2 + " and " + t2 + " are isomorphic: " + isIsomorphic(s2, t2));
    }
}
