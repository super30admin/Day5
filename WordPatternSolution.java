class WordPatternSolution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strs[i];
            if (patternMap.containsKey(pChar)) {
                if (!patternMap.get(pChar).equals(str)) {
                    System.out.println("1st if loop return false:" + str);
                    return false;
                }
            } else {
                patternMap.put(pChar, str);
                if (set.contains(str)) {
                    System.out.println("2nd if loop return false:" + str);
                    return false;
                }
                set.add(str);
            }
        }
        return true;
    }
}