//timecomplexity: O(n)
//spacecomplexity: O(n)
import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s== null || t==null)
            return false;
        if(s.length()!=t.length())
        {
            return false;
        }
            
        HashMap<Character,Character> sm= new HashMap<>();
        HashMap<Character,Character> tm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char schar= s.charAt(i);
            char tchar= t.charAt(i);
            if(!sm.containsKey(schar))
            {
                sm.put(schar,tchar);
            }
            else{
                if(sm.get(schar)!=tchar)return false;
            }
            if(!tm.containsKey(tchar)){
                tm.put(tchar,schar);
            }
            else
            {
                if(tm.get(tchar)!=schar)
                    return false;
            }
        }
        return true;
    }
}