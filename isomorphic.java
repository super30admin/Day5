//TC: O(n)
//SC:O(2n)
//successfully ran on leetcode

import java.io.*;
class Solution {
    public boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Character> map1=new HashMap<>();//Map for mapping s to t
        HashMap<Character,Character> map2=new HashMap<>();//Map for mapping t to s

        for(int i=0;i<s.length();i++)//O(n)
        {
            char s1=s.charAt(i);//character in s at index i
            char t1=t.charAt(i);//character in t at index i

            //Map S to T
            if(map1.containsKey(s1) && map1.get(s1)!=t1)//if map1 contains the character s1 and s1 is mapped to t1
            {
                return false;
            }
            else
            {
                 map1.put(s1,t1);
            }

            //Map T to S
            if(map2.containsKey(t1) && map2.get(t1)!=s1)//if map2 contains the character t1 and t1 is mapped to s1
            {
                return false;
            }
            else
            {
                 map2.put(t1,s1);
            }
        }

        return true;
    }
}
