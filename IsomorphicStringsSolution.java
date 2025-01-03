class IsomorphicStringsSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length() || s == null || t == null || s.length() == 0 || t.length() == 0) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
                if (hs.contains(tChar)) {
                    return false;
                }
                hs.add(tChar);
            }
        }
        return true;
    }
}