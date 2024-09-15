import java.util.*;

//HashMap is used to store all the characters and it's first occurence.
//Time Complexity: O(N)
//Space Complexity: O(N)


public class IsomorphicStrings {
    
    public static boolean isIsomorphic(String s,String t)
    {
        if(Math.abs(s.length()-t.length())>=1)
        {
            return false;
        }

        HashMap<Character,Character> map = new HashMap<>(); 
        

        for(int i =0;i<s.length();i++)
        {
            char s_current = s.charAt(i);
            char t_current = t.charAt(i);

            if(map.containsKey(s_current)==false)
            {
                if(map.containsValue(t_current)==true)
                {
                    return false;
                }
                map.put(s_current, t_current);
            }
            else{
                if(map.get(s_current)!=t_current)
                {
                    return false;
                }
            }
            
        }

        return true;


    }


    public static void main(String args[])
    {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
