import java.util.HashMap;

public class Isomorphic {


    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> Map1=new HashMap<Character,Character>();
        HashMap<Character,Character> Map2=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(Map1.get(s.charAt(i))==null){
                Map1.put(s.charAt(i),t.charAt(i));
            }else if(Map1.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            if(Map2.get(t.charAt(i))==null){
                Map2.put(t.charAt(i),s.charAt(i));
            }else if(Map2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        return true;


    }
}