public class Isomorphoc2 {
    public static void main(String args[])
{
    boolean boo = find("egg", "add");
    System.out.println(boo);
}
public static boolean find(String s, String t)
{
    char[] smap = new char[256];
    char[] tmap = new char[256];

    for(int i = 0; i< s.length();i++)
    {
        char schar = s.charAt(i);
        char tchar = t.charAt(i);

        if(smap[schar - ' ']!=0)
        {
            if(smap[schar -' '] != tchar)
            {
                return false;
            }
        }
        else{
            smap[schar-' '] = tchar;
        }
        
        if(tmap[tchar - ' '] != 0)
        {
            if(tmap[tchar - ' '] != schar)
            {
                return false;
            }

        }
        else{
            tmap[tchar - ' '] = schar;
        }



    }
    return true;
}

    
}
