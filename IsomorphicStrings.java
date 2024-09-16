import java.util.Map;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Using arrays
public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t)
    {
        if(s == null || t == null || s.length() != t.length())
            return false;

        char[] sMap = new char[100]; // since we have char string considering max size 100
        char[] tMap = new char[100];

        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap[sChar -' '] == 0)
            {
                sMap[sChar - ' '] =  tChar;
            }
            else
            {
                if(sMap[sChar -' '] != tChar)
                    return false;
            }
            if(tMap[tChar -' '] == 0)
            {
                tMap[tChar - ' '] =  sChar;
            }
            else
            {
                if(tMap[tChar -' '] != sChar)
                    return false;
            }

        }
        return true;
    }
}


// Using two HashMaps TC: O(n) SC: O(n)
public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t)
    {
        if(s == null || t == null || s.length() != t.length())
            return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!sMap.containsKey(sChar))
            {
                sMap.put(sChar, tChar);
            }
            else
            {
                if(sMap.get(sChar) != tChar)
                    return false;
            }
            if(!tMap.containsKey(tChar))
            {
                tMap.put(tChar, sChar);
            }
            else
            {
                if(tMap.get(tChar) != sChar)
                    return false;
            }

        }
        return true;
    }
}

// Using HashMap and HashSet TC: O(n) SC: O(n)
public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t)
    {
        if(s == null || t == null || s.length() != t.length())
            return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!map.containsKey(sChar))
            {
                if(set.contains(tChar))
                    return false;
                map.put(sChar, tChar);
                set.add(tChar);
            }
            else
            {
                if(map.get(sChar) != tChar)
                    return false;
            }
        }
        return true;
    }
}
