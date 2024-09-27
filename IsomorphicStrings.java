public class IsomorphicStrings {

    //TC is O(n) where n is the length of the string
    //SC is O(1) as map contains at max 26 entries which is constant
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }
        return true;
    }

    public static void main(String args[]){
        String s = "egg";
        String t = "add";
        isIsomorphic(s,t);
    }
}
