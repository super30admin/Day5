/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character>map=new HashMap();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
             {
                map.put(s.charAt(i),t.charAt(i));
             }
             else
               {
                 if(map.get(s.charAt(i))!=t.charAt(i))
                 {
                     return false;
                 }
                   
               }
        }
        return true;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Solution solution=new Solution();
		String s1="aa";
		String s2="ab";
	System.out.print(solution.isIsomorphic(s1,s2));
	}
}
//Time Complexity-O(n)
//Space Complexity-O(n)
//Please note for test case where string 1 is aa and string2 is ab leetcode return true for my code because there is a bug in leetcode it should not
//add to dictionary if it is already there but it is adding a again.
//When I ran to diff IDE, it is giving false }