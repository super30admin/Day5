//Time Complexity: O(n) , where n is the number of characters in the strings
//Space Complexity: O(1), because it will only have the aplhabets which is only 26      characters at max. In this case it says ascii characters so its 256, therefore constant.
//Running on leetcode: yes
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //check if the strings are empty or not
        if (s==null || s.length()==0)
        {
            //returning true because its given that length of the strings is true
            return true;
        }
        //using two hashmaps to store the characters of both the strings
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for (int i=0; i < s.length(); i++)
        {
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);
        
        //take each character from string s and check if sMap contains that key
        if (!sMap.containsKey(sChar))
        {
            //put the key and the associated value from the t string in the sMap
            sMap.put(sChar,tChar);
        }
        else //it contains the key
        {
            //check if the value of key from sMap (value of sChar) matches the key tChar
            if (sMap.get(sChar) != tChar) //doesnt match means 1:1 mapping is not present
            {
                return false;
            }  
        }
        
        //check if tMap doesnt contain teh key
        if (!tMap.containsKey(tChar))
        {
            //put the key and value in the tMap
            tMap.put(tChar, sChar);
        }
        else //if it contains the key it should be equal
        {
            if (tMap.get(tChar) != sChar)
            {
                return false;
            }
        }
        
    }
        return true;
}
}
