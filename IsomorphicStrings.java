//205. Isomorphic Strings - Passed all test cases
/*
TC: O(n) where n is the length of string
SC: O(1) 
Method: Use two hashmaps. If a key exists, compare the key value with the character of the other string. If it doesnt match, they are not isomorphic.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sHm = new HashMap<>();
        HashMap<Character,Character> tHm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sHm.containsKey(sChar))
            {
                if(tChar!=sHm.get(sChar))
                    return false;
            }
            else
            {
                sHm.put(sChar,tChar);
            }
            if(tHm.containsKey(tChar))
            {
                if(sChar!=tHm.get(tChar))
                    return false;
            }
            else
            {
                tHm.put(tChar,sChar);
            }
        }
        return true;
    }
}