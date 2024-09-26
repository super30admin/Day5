class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        //2 hashmaps for storing mappings from s->t and t->s
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        for(int i=0;i < s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            //if charcter from s is already in smap
            if(smap.containsKey(schar)){
                //then get value and check with t charc
                 if(smap.get(schar)!=tchar){
                     return false;
                 }
            }
            else
             {
                //if smap doesnt contains then add
                smap.put(schar,tchar);
             }
            //if charcter from t is already in tmap
              if(tmap.containsKey(tchar)){
                  //then get value and check with s charc
                 if(tmap.get(tchar)!=schar){
                     return false;
                  }
             }
            else
             {
                //if tmap doesnt contains then add
                 tmap.put(tchar,schar);
             }
        }
        return true;
    }
}