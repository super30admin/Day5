import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pmap = new HashMap<>();
        HashSet<String> hset = new HashSet<>();
        String[] split = s.split(" "); //split the string into an array of strings at space. S.C = O(n)
        int pl = pattern.length();
        int sl = split.length;
        if(pl != sl) return false;
        for(int i=0; i<pl; i++) { //T.C is O(n) where n is length of pattern
            char p = pattern.charAt(i);
            String st = split[i];
            if(pmap.containsKey(p)) {
                if(!Objects.equals(pmap.get(p), st)) return false;
            } else {
                if(hset.contains(st)) return false;
                pmap.put(p, st);
                hset.add(st);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String p1 = "abba";
        String s1 = "dog cat cat dog";
        String p2 = "abaca";
        String s2 = "dog cat dog cat dog";
        System.out.println(p1 + " and " + s1 + " are word patterns: " + wordPattern(p1, s1));
        System.out.println(p2 + " and " + s2 + " are word patterns: " + wordPattern(p2, s2));
    }
}
