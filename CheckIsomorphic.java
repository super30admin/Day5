import java.util.HashMap;

public class CheckIsomorphic {


    // explain your approach in 3 sentences:
    // I used two hashmaps to store the mapping of characters from s to t and t to s.
    // I then iterated through the strings and checked if the mapping is consistent.
    // If it is not consistent, I returned false.
    // If it is consistent, I returned true.
    public boolean isIsomorphic2(String s, String t){
    if (s.length() != t.length()){
        return false;
    }

    HashMap<Character,Character> sTot = new HashMap<>();
    HashMap<Character,Character> tTos = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char chars = s.charAt(i);
        char chart = t.charAt(i);

        if (!sTot.containsKey(chars)){
            sTot.put(chars, chart);
        } else if (!sTot.get(chars).equals(chart)){
            return false;
        }
     if (!tTos.containsKey(chars)){
            tTos.put(chart, chars);
        } else if (!tTos.get(chart).equals(chars)){
            return false;
        }
    }
return true;
    }
    public static void main(String[] args) {
        CheckIsomorphic checkIsomorphic = new CheckIsomorphic();
        System.out.println("Isomorphic: " + checkIsomorphic.isIsomorphic("paper", "title"));
        System.out.println("Isomorphic2: " + checkIsomorphic.isIsomorphic2("paper", "title"));
    }
}
