import java.util.HashMap;
import java.util.HashSet;

class IsomorphicStrings{

    public boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i< s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, tChar);
                if(set.contains(tChar)){
                    return false;
                }
                set.add(tChar);
            }
            else{
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s = "egg";
        String t = "add";
        System.out.println(is.isIsomorphic(s, t));
    }
}