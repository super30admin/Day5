
import java.util.HashMap;
import java.util.HashSet;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int l = s.length();
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        for(int i=0;i<l;i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!smap.containsKey(sChar)){
                if(tset.contains(tChar)) return false;
                smap.put(sChar, tChar);
                tset.add(tChar);
            } else{
                if(smap.get(sChar)!=tChar) return false;
            }
        }
         
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings obj = new IsomorphicStrings();
        System.out.println(obj.isIsomorphic("egg", "add"));
    }
}