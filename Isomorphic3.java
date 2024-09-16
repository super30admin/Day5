import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic3 {
public static void main(String args[])
{
    boolean li = find("add","egg");
    System.out.println(li);
}
public static boolean find(String s1, String s2)
{
    HashMap<Character,Character> smap = new HashMap<>();
    HashSet<Character>tset = new HashSet<>();
    
    for(int i = 0;i<s1.length();i++)
    {
        char schar = s1.charAt(i);
        char tchar = s2.charAt(i);

        if(smap.containsKey(schar))
        {
            if(smap.get(schar) != tchar)
            {
                return false;
            }
        }
        else{
            if(tset.contains(schar)){
                return false;
            }
            smap.put(schar, tchar);
            tset.add(tchar);
        }

    }
    return true;

}




    
}
