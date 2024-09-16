public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if(split.length!=pattern.length())
            return false;
        Map<String, Character> map = new HashMap<>();
        boolean[] set = new boolean[26];
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            if(!map.containsKey(split[i])){
                if(set[p-'a']) // if  pattern p is already mapped to some other string
                    return false;
                map.put(split[i], p);
                set[p-'a'] = true;
                
            }else{
                char c = map.get(split[i]);
                if(c!=p)
                    return false;
            }
        }
        return true;
    }