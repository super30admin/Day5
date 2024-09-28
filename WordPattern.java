class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strarr = str.split(" ");

        if(pattern.length()!=strarr.length) {
            return false;
        }

        Map<Character, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for(Integer i = 0; i < pattern.length(); i++) {

            if(m1.put(pattern.charAt(i), i) != m2.put(strarr[i], i)) {
                return false;
            }
        }
        return true;
    }
}