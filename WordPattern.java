import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordPattern {
    //TC - O(n)
    //SC - O(1)
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split(" ");

        if(pattern.length() != strs.length)
            return false;

        Map<Character, String> pMap = new HashMap<>();
        Set<String> strSet = new HashSet<>();

        for(int i =0 ; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strs[i];

            if(pMap.containsKey(pChar)) {
                if(!pMap.get(pChar).equals(str))
                    return false;
            }

            else {
                if(strSet.contains(str))
                    return false;

                pMap.put(pChar, str);
                strSet.add(str);
            }
        }

        return true;

    }
}