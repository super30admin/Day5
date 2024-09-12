//time complexity is o(n) and space is o(1)
class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> S_TO_T_Map = new HashMap<>();
        Set<Character> T_Set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (S_TO_T_Map.containsKey(sChar)) {
                if (S_TO_T_Map.get(sChar) != tChar)
                    return false;
            } else {
                if (T_Set.contains(tChar))
                    return false;
                else {
                    S_TO_T_Map.put(sChar, tChar);
                    T_Set.add(tChar);
                }
            }
        }
        return true;
    }
}