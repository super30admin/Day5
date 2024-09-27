class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        // if the lengths of the two strings don't match we return false immediately.
        if(s.length()!= t.length()) return false;

        for(int i=0;i<s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(sMap.containsKey(schar)){
                if(sMap.get(schar) != tchar) return false;
            }else{
                sMap.put(schar, tchar);
            }
            if(tMap.containsKey(tchar)){
                if(tMap.get(tchar) != schar) return false;

            }else{
                tMap.put(tchar, schar);
            }
        }
        return true;
    }
}