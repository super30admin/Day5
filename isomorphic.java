import java.util.HashMap;
//TC : O(n)
//SC : O(1)
class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if((s.length() != t.length()) || (s == null || s.length() == 0)){
            return false;
        }
// Intially empty maps
        HashMap<Character,Character> sMap = new HashMap<> ();
        HashMap<Character,Character> tMap = new HashMap<> ();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // First time it would be empty and goes too else to add the key and value
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }

            }
            else {
                sMap.put(sChar,tChar);
            }
            // First time it would be empty and goes to else to add the key and value
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }

            }
            else {
                tMap.put(tChar,sChar);
            }
        }
        return true;
    }
}
