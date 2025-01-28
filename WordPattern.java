class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(words.length != pattern.length())
        return false;
        HashMap<Character,String>  pmap = new HashMap<Character,String>();
        HashMap<String,Character>  smap = new HashMap<String,Character>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String st =words[i];
            if(!pmap.containsKey(ch))
            {
                pmap.put(ch,st);
            }
            else{
                if(!pmap.get(ch).equals(st))
                return false;
            }
            if(!smap.containsKey(st))
            {
                smap.put(st,ch);
            }
            else{
                if(smap.get(st)!=ch)
                return false;
            }

        }
        return true;
    }
}


//Time Complexity: O(m+n), where:m is the number of characters in the string s, n is the length of the pattern string.
//Space Complexity: O(m+n), where:m is the number of characters in the string s, n is the length of the pattern string.