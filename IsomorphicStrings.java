class  IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {
        int slength= s.length();
        int tlength= t.length();
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
       for(int i=0;i<slength;i++)
       {
        char sch=s.charAt(i);
        char tch=t.charAt(i);
        if(!smap.containsKey(sch))
        {
            smap.put(sch,tch);
        }
        else{
            if(smap.get(sch)!=tch)
            return false;
        }
        
        if(!tmap.containsKey(tch))
        {
            tmap.put(tch,sch);
        }
        else{
            if(tmap.get(tch)!=sch)
            return false;
        }
       }
       return true;

    }
}

//Time Complexity: O(n), where n is the length of the input strings s and t.
//Space Complexity: O(n), where n is the length of the input strings s and t.