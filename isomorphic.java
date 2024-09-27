import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> a=new HashMap<Character,Character>();
        HashMap<Character,Character> b=new HashMap<Character,Character>();
        char sval;
        char tval;
        for(int i=0;i<s.length();i++){
           sval=s.charAt(i);
           tval=t.charAt(i);
            if(a.isEmpty()){
                a.put(sval,tval);
                b.put(tval,sval);
            }
            else{
                //detecting if entry exists in either of the table
                if(a.containsKey(sval)||b.containsKey(tval)){
                 if(a.containsKey(sval)){
                    if(!a.get(sval).equals(tval)){
                        return false;
                    } 
                 }
                else{
                    if(!b.get(tval).equals(sval)){
                        return false;
                    }
                }
                }
                else{
                    a.put(sval,tval);
                    b.put(tval,sval);
                }
            }
        }
        return true;
    }
}