import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> stoTmap = new HashMap<>();
        Map<String, Character> Ttosmap = new HashMap<>();

        String strArr[] = s.split("\\s");

        if (pattern.length() != strArr.length) {
            System.out.print("length not matching");
            return false;
        }


        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);

            if (stoTmap.containsKey(c1)) {

                String d = stoTmap.get(c1);

                if (!d.equals(strArr[i])) {
                    return false;
                }

            } else {
                stoTmap.put(c1, strArr[i]);
            }


            if (Ttosmap.containsKey(strArr[i])) {

                char c2 = Ttosmap.get(strArr[i]);

                if (c1 != c2) {
                    return false;
                }
            } else {
                Ttosmap.put(strArr[i], c1);
            }

        }

        return true;


    }
}
/*
Time complexity : O(N) where N represents the number of words in s or the number of characters in pattern.

Space complexity : O(M) where M represents the number of unique words in s. The character to word hashmap has complexity of O(1)
 */
