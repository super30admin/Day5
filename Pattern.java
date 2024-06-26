/* do a 1 to 1 mapping of pattern characters as keys and the corresponding input string as value
* Also keep a hashSet of previously mapped strings
*/


import java.util.*;

class Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pmap = new HashMap<>();
        HashSet<String> sset = new HashSet<>();

        int len = pattern.length();
        String[] sl = s.split("\s");
        if(sl.length != len) return false;
        
        for(int i=0;i<len;i++){
            char p = pattern.charAt(i);
            String s1 = sl[i];
            if(!pmap.containsKey(p) ){
                if(!sset.contains(s1)){
                    pmap.put(p, s1);
                    sset.add(s1);
                }else{
                    return false;
                }

            }else{
                if(!pmap.get(p).equals(s1)){
                    return false;
                }
            }
        }

        return true;


    }
}