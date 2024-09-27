import java.util.HashMap;
import java.util.HashSet;

public class Iso {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        if(s.length() != t.length()){
            return  false;
        }
        for(int i=0; i<s.length(); i++){
            char source = s.charAt(i);
            char target = t.charAt(i);

            if(hm.containsKey(source)){
                if(!hs.contains(target)){
                    return false;
                }
                if(hm.get(source)!=target){
                    return false;
                }
            }
            else{
                if(hs.contains(target)){
                    return false;
                }
                hm.put(source, target);
                hs.add(target);
            }
        }
        return true;

    }
}
