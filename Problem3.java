class Solution {
    public boolean wordPattern(String pattern, String s) {
         //2 hashmaps for storing mappings from pattern->s and s->pattern
        String[] swords = s.split(" ");
        if(swords.length!=pattern.length())return false;
        HashMap<Character,String> pmap = new HashMap<>();
        HashMap<String,Character> smap = new HashMap<>();
        for(int i=0;i < pattern.length();i++){
            char pchar = pattern.charAt(i);
            String schar = swords[i];
            //if charcter from p is already in pmap
            if(pmap.containsKey(pchar)){
                //then get value and check with t charc
                 if(!pmap.get(pchar).equals(schar)){
                     return false;
                 }
            }
            else
             {
                //if smap doesnt contains then add
                pmap.put(pchar,schar);
             }
            //if charcter from t is already in tmap
              if(smap.containsKey(schar)){
                  //then get value and check with s charc
                 if(!smap.get(schar).equals(pchar)){
                     return false;
                  }
             }
            else
             {
                //if tmap doesnt contains then add
                 smap.put(schar,pchar);
             }
        }
         return true;
    }
}
