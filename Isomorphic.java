package Day6;

//O(n)
import java.util.HashMap;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t){

        //Edge case
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();

        for(int i=0; i<s.length();i++){

            char a = s.charAt(i);
            char b = t.charAt(i);

            if(!sHash.containsKey(a)){
                sHash.put(a,b);
            }
            else {
                if(!sHash.get(a).equals(b)) {return false;}
            }

            if(!tHash.containsKey(b)){
                tHash.put(b,a);
            }
            else {
                if (!tHash.get(b).equals(a)) {return false;}
            }
        }

        return true;
    }

    public static void main(String args[]){
        String s = "paper";
        String t = "title";

        Isomorphic ob = new Isomorphic();

        System.out.println("Isomorphic? "+ob.isIsomorphic(s,t));

    }
}
