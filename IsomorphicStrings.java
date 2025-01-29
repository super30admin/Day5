import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character>  sMap=new HashMap<>();
        HashSet<Character> tSet=new HashSet<>();
        //HashMap<Character,Character>  tMap=new HashMap<>();
        //char[] sMap=new char[100];
        //char[] tMap=new char[100];
        for(int i=0;i<sl;i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar) return false;
            } else{
                if(tSet.contains(tChar)){
                    return false;
                }else{
                    sMap.put(sChar,tChar);
                    tSet.add(tChar);
                }
            }
            //if(sMap[sChar-' ']==0){
            // sMap[sChar-' ']=tChar;

            //}else{
            //       if(sMap[sChar-' ']!=tChar) return false;
            //  }
            //
            //  if(tMap[tChar-' ']==0){
            //   tMap[tChar-' ']=sChar;
//
            //   }else{
            //   }

            // if(!sMap.containsKey(sChar)){
            //      sMap.put(sChar,tChar);
            //// }else{
            //   if(sMap.get(sChar) != tChar)
            //       return false;
            // }

            //   if(!tMap.containsKey(tChar)){
            //      tMap.put(tChar,sChar);
            //   }else{
            //      if(tMap.get(tChar) != sChar)
            //           return false;
        }
        return true;
    }

    public static void main(String[] args){
        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
        boolean result=isomorphicStrings.isIsomorphic("egg","add");
        System.out.println(result);
    }

}


