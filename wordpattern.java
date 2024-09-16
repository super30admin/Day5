//TC: O(n)
//SC:O(2n)
//successfully ran on leetcode

import java.io.*;
class Solution {
    public boolean wordPattern(String pattern, String s)
    {

        HashMap<Character,String> map1=new HashMap<>();//Map for mapping s to t
        HashMap<String,Character> map2=new HashMap<>();//Map for mapping t to s

        String[] sspl=s.split(" ");

        if(pattern.length()!=sspl.length)
            return false;

        for(int i=0;i<pattern.length();i++)//O(n)
        {
            char pattern1=pattern.charAt(i);//character in s at index i
            String s1=sspl[i];//character in t at index i


            //Map S to T
            if(map1.containsKey(pattern1) && !s1.equals(map1.get(pattern1)))//if map1 contains the string s1 and s1 is mapped to t1
            {
                System.out.println(s1);
                return false;
            }
            else
            {
                 map1.put(pattern1,s1);
            }

            //Map T to S
            if(map2.containsKey(s1) && !map2.get(s1).equals(pattern1))//if map2 contains the character t1 and t1 is mapped to s1
            {
                return false;
            }
            else
            {
                 map2.put(s1,pattern1);
            }
        }

        return true;
    }
}
