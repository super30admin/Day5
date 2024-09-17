import java.util.HashMap;

public class Bijection {
    public boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if (pattern.length() != temp.length) return false;
        HashMap<Character, String> pMap = new HashMap();
        HashMap<String, Character> sMap = new HashMap();
        for (int i = 0; i< temp.length; i++) {
            char pChar = pattern.charAt(i);
            String sString = temp[i];
            if (!pMap.containsKey(pChar)) {
                if (sMap.containsKey(sString)) {
                    return false;
                }
                else {
                    pMap.put(pChar, sString);
                    sMap.put(sString, pChar);
                }
            }
            else {
                String w = pMap.get(pChar);
                if (!w.equals(sString))
                    return false;
            }
        }
        return true;
    }
}