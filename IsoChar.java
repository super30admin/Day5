import java.util.HashMap;

public class IsoChar {

    public boolean checkIso(String a, String b) {

        HashMap<Character, Character> hsa = new HashMap<>();
        HashMap<Character, Character> hsb = new HashMap<>();
        if (a.length() != b.length())
            return false;
        else {
            char[] aCharAr = a.toCharArray();
            char[] bCharAr = b.toCharArray();
            for (int i = 0; i < aCharAr.length; i++) {
                if (hsa.containsKey(aCharAr[i])) {
                    if (hsa.get(aCharAr[i]) != bCharAr[i]) {
                        return false;
                    }
                } else {
                    if (hsb.containsKey(aCharAr[i]))
                        return false;
                    hsa.put(aCharAr[i], bCharAr[i]);
                    hsb.put(bCharAr[i], aCharAr[i]);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsoChar ic = new IsoChar();
        System.out.println(ic.checkIso("egg", "add"));
        System.out.println(ic.checkIso("aaa", "bbb"));
        System.out.println(ic.checkIso("aca", "add"));
        System.out.println(ic.checkIso("fcy", "nic"));
        System.out.println(ic.checkIso("eggn", "niie"));
    }
}
