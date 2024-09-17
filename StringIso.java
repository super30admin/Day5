import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringIso {

    public boolean checkIso(String a, String b) {

        HashMap<Character, String> hsa = new HashMap<>();
        // ArrayList<String> hsb = new ArrayList<>();
        char[] aCharAr = a.toCharArray();
        String[] bStrArr = b.split(" ");

        if (aCharAr.length != bStrArr.length)
            return false;
        else {
            // System.out.println(2);
            for (int i = 0; i < aCharAr.length; i++) {
                if (hsa.containsKey(aCharAr[i])) {
                    if (!hsa.get(aCharAr[i]).equals(bStrArr[i])) {
                        return false;
                    }
                } else {
                    // if (hsb.contains(bStrArr[i]))
                    // return false;
                    hsa.put(aCharAr[i], bStrArr[i]);
                    // hsb.add(bStrArr[i]);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        StringIso ic = new StringIso();
        System.out.println(ic.checkIso("abba", "dog cat cat dog"));
        System.out.println(ic.checkIso("abba", "dog cat cat mad"));
        System.out.println(ic.checkIso("abbc", "fry cat cat dog"));

    }
}
