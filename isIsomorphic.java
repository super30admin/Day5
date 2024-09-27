/*
Time complexity  - O(N)  where N is the length of any of the string
Space complexity - O(N) we use two hashmaps but still 2N is same as N.
*/

class Solution {
    public boolean isIsomorphic (String s, String t) {
    if(s.length() != t.length())
        return false;
    HashMap<Character,Character> smap=new HashMap<Character,Character>();
    HashMap<Character,Character> tmap=new HashMap<Character,Character>();
    for(int i=0;i<s.length();i++)
    {
        Character sval=s.charAt(i);
        Character tval=t.charAt(i);
        if(smap.containsKey(sval))
        {
            if(smap.get(sval)!=tval)
                return false;
        }
        else
        {
            smap.put(sval,tval);
        }
        if(tmap.containsKey(tval)) // check both ways to ensure the same target character is not already used up.
        {
            if(tmap.get(tval)!=sval)
                return false;
        }
        else
        {
            tmap.put(tval,sval);
        }
    }
    return true;
    }
}
