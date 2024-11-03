//Problem 3:
//Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
//
//Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
//
//Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
//
//Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.


//Time complexity: O(n)
//Space complexity: O(n)


import java.util.HashMap;
import java.util.HashSet;

public class problem3 {

    public static boolean isIsomorphic(String pattern, String s)
    {
        if (pattern==null && s==null)
        {
            return true;
        }
        if (pattern==null && s==null)
        {
            return false;
        }
        String[] words=s.split(" ");
        int wordCount=words.length;
        if (pattern.length()!=wordCount)
        {
            return false;
        }
        HashMap<Character, String> map=new HashMap<>();
        String[] str=s.split(" ");
        HashSet<String> set= new HashSet<>();
        for (int i=0;i<pattern.length();i++)
        {
            char a= pattern.charAt(i);
            String b=words[i];
            if (map.containsKey(a))
            {
                if (!map.get(a).equals(b))
                {
                    return false;
                }
            }
            else {
                if (set.contains(b))
                {
                    return false;
                }
                set.add(b);
                map.put(a,b);
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
      boolean res=  isIsomorphic("egg","add");
    }


}
