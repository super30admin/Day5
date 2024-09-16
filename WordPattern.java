class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() == 0) return false;
        
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        String[] strings = s.split(" ");
        
        if(strings.length != pattern.length()) {
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = strings[i];
            
            if(map.containsKey(ch)) {
                if(!str.equals(map.get(ch))) {
                    return false;
                }
            } else {
                if(set.contains(str)) {
                    return false;
                }
                map.put(ch, str);
                set.add(str);
            }
        }

        return true;
    }
}