//Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//Example 1: Input: s = "egg", t = "add" Output: true
//
//Example 2: Input: s = "foo", t = "bar" Output: false
//
//Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

//Time complexity: O(n)
//Space complexity: O(n)


import java.util.HashMap;
import java.util.HashSet;

public class problem2 {
    private static boolean isIsomorphic(String a, String b)
    {
        if (a==null && b==null)
        {
            return true;
        }
        if(a==null || b==null)
        {
            return false;
        }
        if (a.length() != b.length())
        {
            return false;
        }
        HashMap<Character,Character> sMap= new HashMap<>();
        HashSet<Character> sSet= new HashSet<>();
        for (int i=0;i<a.length();i++)
        {
            char aChar= a.charAt(i);
            char bChar= b.charAt(i);

            if (sMap.containsKey(aChar))
            {
                if (sMap.get(aChar) != bChar)
                {
                    return false;
                }
            }
            else {
                if (sSet.contains(bChar)) // Search space is O(1)
                {
                    return false;
                }
                sSet.add(bChar);
                sMap.put(aChar, bChar);

            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        isIsomorphic("egg","add");
    }
}
