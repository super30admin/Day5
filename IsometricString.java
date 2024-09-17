import java.util.HashMap;
import java.util.Map;

public class IsometricString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Character> sMap=new HashMap<>();
        Map<Character,Character> tMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!sMap.containsKey(s.charAt(i)))
            sMap.put(s.charAt(i), t.charAt(i));
            else {
                if(sMap.get(s.charAt(i))!=t.charAt(i))
                return false;
            }
            if(!tMap.containsKey(t.charAt(i)))
            tMap.put(t.charAt(i), s.charAt(i));
            else {
                if(tMap.get(t.charAt(i))!=s.charAt(i))
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        IsometricString obj=new IsometricString();
       System.out.println(obj.isIsomorphic("foo","bar"));
    }
}