class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap();
        HashMap<String, Character> map1 = new HashMap();
        String[] t = s.split(" ");
        if(t.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,t[i]);
            }
            else if(!map.get(c).equals(t[i]))
                return false;
            if(!map1.containsKey(t[i]))
            {
                map1.put(t[i],c);
            }
            else if(!map1.get(t[i]).equals(c))
                return false;
        }
        return true;
    }
}

//time complexity is O(N)
//space complexity is O(1)