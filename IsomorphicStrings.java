class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> valueSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            } else {
                if (valueSet.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
                valueSet.add(t.charAt(i));
            }
        }
        return true;
    }
}