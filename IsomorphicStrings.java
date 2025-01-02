class IsoMorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet= new HashSet<Character>();

        for(int i=0; i<s.length(); i++){
            Character sc = sMap.putIfAbsent(s.charAt(i), t.charAt(i));
            if((sc != null && sc!=t.charAt(i)) || (sc == null && tSet.contains(t.charAt(i)))){
                return false;
            }
            tSet.add(t.charAt(i));
        }
        return true;

    }
}
