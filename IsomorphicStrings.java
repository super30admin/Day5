class IsomorphicStrings {
    HashMap<Character, Character> st = new HashMap<>();
    HashSet<Character> mapped = new HashSet<>();
    public boolean isIsomorphic(String s, String t) {
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(st.containsKey(sChar)){
                if(st.get(sChar) != tChar)
                    return false;
            }else{
                if(mapped.contains(tChar)){
                    return false;
                }
                mapped.add(tChar);
                st.put(sChar, tChar);
            }
        }
        return true;
    }
}